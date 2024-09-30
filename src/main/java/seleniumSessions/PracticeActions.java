package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeActions {

	public static void main(String[] args) {

		// creating the webElements
		// WE
		// WEs
		// Actions
		// text:getText();
		// to fill the data:sendkeys();
		// to click:click();
		// isDisplayed,isEnabled,isSelected
		// attribute:getAttribute();

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// sendkeys
		driver.findElement(By.id("input-email")).sendKeys("Srinadh@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Srinad@1234");

		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

		// click+clear+sendkeys
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-email")).sendKeys("Srinadh@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Srinad@1234");

		// driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		// getText

		String txt = driver.findElement(By.tagName("h2")).getText();
		System.out.println(txt);
		String txt1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]")).getText();
		System.out.println(txt1);
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.name("agree")).click();

		boolean f1 = driver.findElement(By.name("agree")).isSelected();
		System.out.println("privacy policy is   checked: " + f1);

		boolean f2 = driver.findElement(By.name("agree")).isDisplayed();
		System.out.println("privacy policy is displayed :" + f2);

		boolean f3 = driver.findElement(By.name("agree")).isEnabled();
		System.out.println("privacy policy is enabled :" + f2);

		// attribute:getAttribute();
		String f4 = driver.findElement(By.id("input-telephone")).getAttribute("placeholder");
		System.out.println("telephone text box field name: " + f4);

		driver.findElement(By.id("input-firstname")).sendKeys("Srinad");
		driver.findElement(By.id("input-lastname")).sendKeys("Maruboina");
		driver.findElement(By.id("input-email")).sendKeys("Srinad@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9849617688");
		driver.findElement(By.id("input-password")).sendKeys("Srinad@1234");
		driver.findElement(By.id("input-confirm")).sendKeys("Srinad@1234");

		String f5 = driver.findElement(By.id("input-telephone")).getAttribute("value");
		System.out.println("telephone text box field captured: " + f5);

		List<WebElement> listlink = driver.findElements(By.className("form-control"));
		// normal way to print link list array
//	String u1=	listlink.get(0).getAttribute("value");
//	String u2=	listlink.get(1).getAttribute("value");
//	String u3=	listlink.get(2).getAttribute("value");
//	String u4=	listlink.get(3).getAttribute("value");
//	String u5=	listlink.get(4).getAttribute("value");
//	String u6=	listlink.get(5).getAttribute("value");
//	String u7=	listlink.get(6).getAttribute("value");
//		System.out.println("index0: "+u1);
//		System.out.println("index1: "+u2);
//		System.out.println("index2: "+u3);
//		System.out.println("index3: "+u4);
//		System.out.println("index4: "+u5);
//		System.out.println("index5: "+u6);
//		System.out.println("index6: "+u7);
		System.out.println(listlink.size());

		for (WebElement e : listlink) {
			String xt = e.getAttribute("value");
			System.out.println(xt);
		}

		for (WebElement e : listlink) {
			String tj1 = e.getAttribute("placeholder");
			System.err.println(tj1);
		}

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		driver.findElement(By.id("input-email")).sendKeys("Srinad@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("srinadh@1234");

		String a1 = driver.findElement(By.id("input-email")).getAttribute("value");

		String a2 = driver.findElement(By.id("input-password")).getAttribute("value");
		System.out.println(a1);
		System.out.println(a2);

		List<WebElement> loginList = driver.findElements(By.className("form-control"));

		for (WebElement e : loginList) {
			String s = e.getAttribute("value");
			System.err.println(s);
		}
		
		
		driver.navigate().to("https://www.flipkart.com/");
		
	List<WebElement> ListLint=driver.findElements(By.tagName("a"));
		
		int s2=listlink.size();
		
		System.out.println(s2);
		
		
		for (WebElement e:listlink) {
			String s3=e.getAttribute("href");
			System.out.println(s3);
		}
	}

}
