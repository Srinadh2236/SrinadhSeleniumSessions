package UITests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {
	

	
//	@BeforeTest
//	public void setUp() {
//	driver = new ChromeDriver();
//	driver.get("https://google.com");
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}
//	

	@Test(priority = 1)
	public void PageTitleTest() {
	//driver.get("https://google.com");
	String actualTitle=	driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, "Google"); // here assertion is the validating the title actual vs expected
	}
	
	@Test(priority = 2)
	public void pageURLTest() {
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("google"));
		
	}
	
	
//	@AfterTest
//	public void tearDown() {
//		driver.quit();
//	}
	

}
