package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
//	BS----connectWithDB
//	BT-----createUser
//	BC------opendBrowser
	
		//	BM--------LogintoApp
		//	cart test
		//	AM-----logout
	
		//	BM--------LogintoApp
		//	payment test
		//	AM-----logout
	
		//	BM--------LogintoApp
		//	search test
		//	AM-----logout
	
//	AC-----closeBrowser
//	AT-------deleteUser
//	AS-----------disconnectDB

	
	
	
	//these are the 4 pre annotations are there.
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS----connectWithDB");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT-----createUser");
	}
	//3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC------opendBrowser");
	}
	//4  //7 //10
	@BeforeMethod   // Before method having special feature is every test case it will run fist. and then test case will run alphabetical order
	public void logintoApp() {
		System.out.println("BM--------LogintoApp");
	}
	//11 
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	//5
	@Test
	public void cartTest() {
		System.out.println("cart test");
	}
	//8
	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}
	//6  //9  //12
	@AfterMethod  // after each and every test method will run.
	public void logout() {
		System.out.println("AM-----logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-----closeBrowser");
	}
	//14
	@AfterTest
	public void deleteUSer() {
		System.out.println("AT-------deleteUser");
	}
	//15
	@AfterSuite
	public void disCOnnectDB() {
		System.out.println("AS-----------disconnectDB");
	}
}
