package UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestWithBM {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void PageTitleTest() {
	String actualTitle=	driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void pageURLTest() {
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
		
	}
	
	@Test
	public void pageLogoTest() {
	boolean actualflag=	driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
	Assert.assertTrue(actualflag);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}