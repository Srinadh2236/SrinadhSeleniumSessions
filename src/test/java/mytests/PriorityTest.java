package mytests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 1) //if we give priority based on that it will run or else it will be run based on alphabetical order
	public void searchTest() {
		System.out.println("search test");
	}
	
	@Test(priority = 3)
	public void cartTest() {
		System.out.println("cart test");
	}
	@Test(priority = 2)
	public void paymentTest() {
		System.out.println("payment test");
	}
	
	
	
	@Test(priority = 0)
	public void aTest() {
		System.out.println("a test");
	}
	@Test(priority = 5)
	public void bTest() {
		System.out.println("b test");
	}
	@Test(priority = 4)
	public void cTest() {
		System.out.println("c test");
	}
	
	
	//is it good practice use priority   ?? NO (not good practice) test cases should be independent 
	//AAA what is in unit testing
	//Arrange Act Assert.
	
	//CRUD  opertation  --- interview question
	//createUserTest----t1
			
			//fill the form and submit--- validate
	
	
	//retriveUserTest ---t2
			//fill the form and submit--- validate   // here t1 also use to better it should be independent each other . there is no dependency
			//get the user and validate
	
	//updateUserTest---t3
		//fill the form and submit--- validate 
	   //get the user and validate
		//update the user.
	
	//deleteUserTest---t4   // i will create fresh user when ever i want to do any test .  
	//fill the form and submit--- validate 
	   //get the user and validate
		//delete the user.
}

