import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");

		// frame1
		driver.switchTo().frame(driver.findElement(By.id("pact1")));
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Naveen Automation");

		// frame2
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='pact2']")));
		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("Java testing");

		// frame3
		driver.switchTo().frame(driver.findElement(By.id("pact3")));
		driver.findElement(By.xpath("//input[@id='glaf']")).sendKeys("Good package");

		// here we can go frame 1 to frame2 switch directly by using switch but frame 1
		// to frame3 we cant

		// i want to enter in frame2

		driver.switchTo().parentFrame(); // parent frame means it will go to the back frame2.
		driver.findElement(By.xpath("//input[@id='jex']")).sendKeys("  selenium");

		driver.switchTo().parentFrame();// f2-->f1
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("  labs");

		// driver.switchTo().parentFrame(); f1-->main frame or default
		// or
		driver.switchTo().defaultContent();
		String name = driver.findElement(By.tagName("h3")).getText();
		System.out.println(name);
		
		
		//if iwant to go default to f1 to f3 it wnt by pass the f2 
		
		//page-->f1
		//f1--f2:yes
		//f2-->f3:yes
		//page-->f2:no we cant by pass f1
		//page-->f3: i cant skip the sequence
		//page-->f1->f2->f3:yes
		
		
		//f3-->f2 :yes use parentFrame
		//f2-->f1:yes use parentframe
		//f1-->page:yes use parentframe and default
		//f3-->f1:no we cant skip
		
		//finally we have to go step by step only:
		
		//f3-->main page :yes we defaultframe it will go the main frame
		
		//driver.switchTo().defaultContent();
		
		
		//in sigle line we can go like this
//		driver.switchTo().frame("pact1")
//				.switchTo().frame("pact2")
//					.switchTo().frame("pact3")
//						.findElement(By.id("jex"))
//							.sendKeys("selenium");
		
		//f1-->f2--f3---f2---f1 entering the value
//		driver.switchTo().frame("pact1")
//				.switchTo().frame("pact2")
//					.switchTo().frame("pact3")
//						.switchTo().parentFrame()//f2
//								.switchTo().parentFrame()//	f1
//								.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("Naveen automation labs");
//		
	//f1--f2--f3--default page to get text in main page.
		String headerText=	driver.switchTo().frame("pact1")
									.switchTo().frame("pact2")
										.switchTo().frame("pact3")
											.switchTo().defaultContent()
												.findElement(By.tagName("h3")).getText();
								
				System.out.println(headerText);
	
	}

}
