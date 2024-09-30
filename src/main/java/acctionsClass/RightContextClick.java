package acctionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightContextClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		// right click--context click both are same

		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();

		List<WebElement> rightList = driver.findElements(By.cssSelector("ul.context-menu-list span"));

//		System.out.println(rightList.size());
//		for( WebElement e: rightList) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("Edit")) {
//				e.click();
//				break;
//			}
//		}
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
	}

}
