package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		//driver.switchTo().frame(2);// 3 is the frome the top 3rd iframe so as per index value is 2 is given.
		//driver.switchTo().frame("main");// string  nameOrID only two string are given.
		driver.switchTo().frame(driver.findElement(By.name("main")));// webElement are given for this.
		
	String header=	driver.findElement(By.tagName("h2")).getText();
	System.out.println(header);	
	
	//if we want to go the page use defaultContent
	
	driver.switchTo().defaultContent();
	
	int frameSize =driver.findElements(By.tagName("frame")).size();
	System.out.println(frameSize);// 8 total 8 frames are there in this page 
	
	driver.switchTo().parentFrame();/// it go back to the parent frame.bove the frame
	
	
	}

}
