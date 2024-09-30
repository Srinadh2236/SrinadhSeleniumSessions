package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	
	@Test
	public void loginTest() {
		System.out.println("login Test");
		int i=9/0;     // it will throw the exception so dependent method will not run it will skip.
	}
	
	@Test(dependsOnMethods = "loginTest")	// it depending on login test so login test will run the first
	public void homePageTest() {
		System.out.println("Home page test");
	}
	
	@Test(dependsOnMethods = "homePageTest") // homepage test skip so this searchtest also skiped. both
	public void searchTest() {
		System.out.println("search Test");
	}
}
