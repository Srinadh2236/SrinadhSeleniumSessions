package xPath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {


		 driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//parent --child
		//form[@id='hs-login']//input[@id='username']---1 ----//hubspot --usename
		
		//form[@id='hs-login']/div---8 (direct child list )
		//form[@id='hs-login']//div---23(direct  + indirect child list will show for //)
		
		//decendant::tagname(option) ---
		//slect[@id='Form-getForm-Country']/decendant::option
		//slect[@id='Form-getForm-Country']//   --- both are same
		
		
		//following--if there is no relation ship use onlu following::tagname 
		//input[@id='input-email']/following::input[@id='input-password']---------
		
		//preceding---if there is no relation ship use only preceding::tagname 
		//input[@id='input-password']/preceding::input[@id='input-email'] --------
		
		//assignment=====================registration page lebles names for every text field
		//input[@id='input-firstname']/preceding::label[@for='input-firstname']
		//input[@id='input-lastname']/preceding::label[@for='input-lastname']
		//input[@id='input-email']/preceding::label[@for='input-email']
		//input[@id='input-telephone']/preceding::label[@for='input-telephone']
		//input[@id='input-password']/preceding::label[@for='input-password']
		//input[@id='input-confirm']/preceding::label[@for='input-confirm']
		
		
		//input[@id='first-name']
		//*[@id='first-name']
		
		
		
		//child to parent
		//input[@id='username']/.. (immediate parent is div )use /../../.. it will go back words "traversing"  in DOM
		
		//input[@id='username']/..
		//input[@id='username']/parent::div  -----child to parent both are immediate parent
		 
		//again im going to immediate parent(is only for immediate parent)
		//input[@id='username']/parent::div/parent::div
		
		//child to ancestor( grandParent)
		//input[@id='username']/ancestor::form ----1
		
		//input[@id='input-firstname']/ancestor::div[@id='content']
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']")).click();// ---click check box by using ancestor
//		driver.findElement(By.xpath("//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//a[text()='Jordan.Mathews']/ancestor::tr//input[@type='checkbox']")).click();
		selectUser("Joe.Root");
		selectUser("John.Smith");
		selectUser("Kevin.Mathews");
		
//	List<WebElement> playerDetails=	driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
//	
//	for (WebElement e:playerDetails) {
//		String text=e.getText();
//		System.out.println(text);
//		}
	
		System.out.println(playerDetails("Joe.Root"));
		System.out.println(playerDetails("Kevin.Mathews"));
		System.out.println(playerDetails("John.Smith"));
		
	    List<String>	t1= playerDetails("Joe.Root");
	    System.out.println(t1);
	
}
	static WebDriver driver;
	public static void selectUser(String playerName) {
		driver.findElement(By.xpath("//a[text()='"+playerName+"']/ancestor::tr//input[@type='checkbox']")).click();
	}
	
	public static List<String> playerDetails(String playerName) {
		List<WebElement> playerDetails=	driver.findElements(By.xpath("//a[text()='"+playerName+"']/parent::td/following-sibling::td"));
	List<String> details =new ArrayList<String>();
		for (WebElement e:playerDetails) {
			String text=e.getText();
			details.add(text);
			}
		return details;
	}
	
}
