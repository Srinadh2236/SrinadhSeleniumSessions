package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	int age;
//	@Test
//	public void paymentTest() {
//		System.out.println("payment test");
//		int i=9/0; 
//	}
	
	@Test(expectedExceptions = ArithmeticException.class) /// so it will pass the test case
	public void paymentTest() {
		System.out.println("Payment test");
		int i =9/0;
	}
	
	// can you give multiple exception:yes
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class}) /// so it will pass the test case
	public void cartTest() {
		System.out.println("cart test");
		int i =9/3;
		//ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		ExpectedExceptionConcept obj = null; // it will throw null pointer exception
		obj.age=20;  // pass both test cases
	}

}
