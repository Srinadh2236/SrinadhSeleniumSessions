package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorAssignment {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstNameEle=driver.findElement(By.xpath("//label[text()='First Name']"));
		driver.findElement(with(By.id("input-firstname")).toRightOf(firstNameEle)).sendKeys("Naveen");
		
		WebElement lastNameEle=driver.findElement(By.xpath("//label[text()='Last Name']"));
		driver.findElement(with(By.id("input-lastname")).toRightOf(lastNameEle)).sendKeys("Automations");
		
		
		WebElement eMailEle=driver.findElement(By.xpath("//label[text()='E-Mail']"));
		driver.findElement(with(By.id("input-email")).toRightOf(eMailEle)).sendKeys("Naveen@gmail.com");
		
		WebElement TeleEle=driver.findElement(By.xpath("//label[text()='Telephone']"));
		driver.findElement(with(By.id("input-telephone")).toRightOf(TeleEle)).sendKeys("987456258");
		
		
		WebElement passEle=driver.findElement(By.xpath("//label[text()='Password']"));
		driver.findElement(with(By.id("input-password")).toRightOf(passEle)).sendKeys("Naveen@12345");
		
		
		WebElement ConPassEle=driver.findElement(By.xpath("//label[text()='Password Confirm']"));
		driver.findElement(with(By.id("input-confirm")).toRightOf(ConPassEle)).sendKeys("Naveen@12345");
		
		
		
	WebElement checkBoxEle=	driver.findElement(By.xpath("//input[@name='agree']"));
		
	String name=driver.findElement(with(By.linkText("Privacy Policy")).toLeftOf(checkBoxEle)).getText();
	
	System.out.println(name);
	if(name.equals("Privacy Policy")) {
		System.out.println("pass");
	}else{
		System.out.println("fail");
	}
	
	String gettxt=driver.findElement(with(By.cssSelector(".pull-right:not(#top-links):not(.dropdown-menu.pull-right)")).toLeftOf(checkBoxEle)).getText();
	System.out.println(gettxt);
	}
	

}
