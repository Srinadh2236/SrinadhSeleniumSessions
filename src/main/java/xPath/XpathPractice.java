package xPath;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {
	public static void main(String[] args) {

		 driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//clicking the check box for joe.root
		driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']")).click();
		
		By playerXpath=	By.xpath("//a[text()='Joe.Root']/ancestor::tr/td");
//		List<WebElement> lst=driver.findElements(playerXpath);
//		
//		for(WebElement e:lst) {
//		String text=	e.getText();
//		System.out.println(text);
//		}
//		
	listPlayer("Joe.Root");// if you dnt want check box text then use in xpath following-sibling::htmltag(td) for joe.root
	
	
	}
	
	static WebDriver driver;
	public static void listPlayer(String playerName) {
	List<String> li=	getPlayerDetais(playerName);
	System.out.println(li);
	}
	public static List<String> getPlayerDetais(String playerName) {
		List<WebElement> lst=driver.findElements(By.xpath("//a[text()='"+playerName+"']/ancestor::tr/td"));
		List<String>  fullList= new ArrayList<String>();
		for(WebElement e:lst) {
			String text = e.getText();
			fullList.add(text);
			}
			return fullList;
	}



}

