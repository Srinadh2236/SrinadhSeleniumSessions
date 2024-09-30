package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		
		//only webElements will be apply . it will not apply on title and url,popups 
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// this type wait are global waits
		//if we are not using any waits webElement is not found immediately will thorow the the NOSUCHELEMENT FOUND EXCEPTION
		
		// if we are keep any waits imply explicit any thing it will wait untill 10 sec then it will throw NSE.
		
		//globals waits:
			//it will be applied wait for all webElements by default
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//here selenium gona wait for maximum 10 sec for each and every webElement
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Naveen@gmail.com");//
//		driver.findElement(By.id("input-password")).sendKeys("Naveen@123");
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//when we use implicitly wait the driver always gi via implicitly wait. 
		//Driver ---waits ----server----applicatiin
		
		//if we are not use it will go the driver will go the server and then aplication
		//Driver----server----application
		
		// my home page will take 20sec then i can agian over ride the implicit wait
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//from now the implicitly wait will be 20se 
		//e5       //20sec
		//element6  //20sec
		//elemt7   //20sec
		
//		2.2 : explicitly wait
//				2.1.1:WebDriverWait
//				2.1.2:FluentWait


		//i can apply wait on specific element 
		
		//Wait(I) until();---FluentWait(C)until(){}+individual methods(){};-----WebDriverWait(c) no methods;
									//parent id fluentwait				-----child is webDriverWait
		
		
		
	By email=	By.xpath("//input[@id='input-email']");
	By password=	By.id("input-password");
	By login=	By.xpath("//input[@value='Login']");
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	WebElement email_ele=	wait.until(ExpectedConditions.presenceOfElementLocated(email));
//							//wait untill presence of element thats the meaning of this.
//	//an other way of creating webElement by using Waits
//	email_ele.sendKeys("Naveen@gmail.com");// for only one element wait for this element explicit wait
//	
//	// once email filed available then all  password and login button also avalable so no need use wait for this
//	
//	driver.findElement(password).sendKeys("naveen@123");
//	driver.findElement(login).click();
	
			waitForElemetnPresence(email, 10).sendKeys("Naveen@gmail.com");// properWaits
			getElement(password).sendKeys("Naveen@123");// no waits
			getElement(login).click();// no waits
	
	}
	
	// both are given the webElement but first method is proper waits below method dnt have wait it wnt wait for element it will throw NSE
	//checking the element present on the DOM
	public static WebElement waitForElemetnPresence(By locator , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	//checking the element present on the DOM and also visible on the page (Double confirmation)
	public static WebElement waitForElemetnVisible(By locator , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public static WebElement getElement(By locator) {  
		return driver.findElement(locator);
	}

}
