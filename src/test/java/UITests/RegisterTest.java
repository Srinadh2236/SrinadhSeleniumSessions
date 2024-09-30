package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class RegisterTest extends BaseTest  {
	@Test
	public void registerPageTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Naveen");
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Automation labs");
		
		driver.findElement(By.cssSelector("#input-email")).sendKeys("Naveennn1223@gmail.com");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("9858475559");
		
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Naveen@123");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Naveen@123");
		
		driver.findElement(By.cssSelector("input[name='agree']")).click();		
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		
		
		
		String successMsg	=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		Assert.assertTrue(successMsg.contains("Created"));
		
		// testng.xml data 
		
//		<test name="Register Test">
//		<classes>
//			<class name="UITests.RegisterTest" />
//		</classes>
//	</test>
		
	}
}
