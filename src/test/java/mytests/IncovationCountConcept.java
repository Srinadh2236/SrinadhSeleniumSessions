package mytests;

import org.testng.annotations.Test;

public class IncovationCountConcept {

//	@Test(invocationCount = 10)// it will run 10 times same
//	public void paymentTest() {
//		System.out.println("Payment test");
//	}
	
	//2
	@Test(invocationCount = 10,priority = 1)// it will run 10 times priority 1
	public void paymentTest() {
		System.out.println("Payment test");
	}
	//1
	@Test(invocationCount = 10 , priority = 0)// it will run 10 times same
	public void cartTest() {
		System.out.println("cart test");
	}
}
