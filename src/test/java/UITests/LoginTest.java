package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(priority = 1)
	public void PageTitleTest() {
	String actualTitle=	driver.getTitle();
	System.out.println(actualTitle);
	Assert.assertEquals(actualTitle, "Account Login"); // here assertion is the validating the title actual vs expected
	}
	
	@Test(priority = 2)
	public void pageURLTest() {
		String actualURL=driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
		
	}
	
	@Test(priority = 3)
	public void pageLogoTest() {
	boolean actualflag=	driver.findElement(By.xpath("//img[@class='img-responsive']")).isDisplayed();
	Assert.assertTrue(actualflag);
	}
	
	
	
	
	
}
