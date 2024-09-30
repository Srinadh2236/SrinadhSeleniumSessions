package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginPageSearchTest extends BaseTest {
	
	//data driver approach : fetch the data from data providers are: testNF dara providers,excel,csv,json
	
	// 2d array having rows and columns
	@DataProvider
	public Object[][] getSearchData() {
		
		return new Object[][] {
			{"macbook","MacBook Pro"},
			{"imac","iMac"},
			{"samsung","Samsung Galaxy Tab 10.1"},
			{"samsung","Samsung SyncMaster 941BW"}
			
		};
	}
	
	
	
	@Test(dataProvider = "getSearchData")
	public void searchTest(String searchKey,String productName) {
		driver.findElement(By.xpath("//input[@placeholder='Search']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(searchKey);
		driver.findElement(By.xpath("//div[@id='search']/span/button")).click();

		driver.findElement(By.linkText(productName)).click();
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
		Assert.assertEquals(header, productName);

	}
}
