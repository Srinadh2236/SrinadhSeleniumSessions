package xPath;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoScoreCard {

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/west-indies-vs-south-africa-2024-1433361/west-indies-vs-south-africa-1st-test-1433365/full-scorecard");
		Thread.sleep(6000);

		// String wkTacker = driver.findElement(By.xpath("//span[text()='Mikyle
		// Louis']/ancestor::tr/td/span")).getText();
//	 String wkTacker = driver.findElement(By.xpath("//span[text()='Keacy Carty']/ancestor::tr/td/span")).getText();
//	
//	 System.out.println(wkTacker);

		System.out.println(wkTakerName("Mikyle Louis"));
		System.out.println(wkTakerName("Keacy Carty"));

		// get runs
//	List<WebElement> runsList=	driver.findElements(By.xpath("//span[text()='Mikyle Louis']/ancestor::td/following-sibling::td"));
//	
//	for (WebElement e:runsList) {
//		String text =e.getText();
//		System.out.println(text);
//	}

		List<String> pRuns = playerRuns("Mikyle Louis");
	 System.out.println(pRuns);//or
		for (String e : pRuns) {

			System.out.println(e);
		}
		
		
		//parent to  direct child : /
		//parent to indrirect child: //
		
		//child to parent: parent::tagname   or /..
		//child to acestor: ancestor::tagname or /../../../..
		
		//to preceding sibling : preceding - sibling::tagname
		//to following sibling : following - sibling::tagname
		
		
	}

	static WebDriver driver;

	public static String wkTakerName(String playerName) {
		return driver.findElement(By.xpath("//span[text()='" + playerName + "']/ancestor::tr/td/span")).getText();
	}

	public static List<String> playerRuns(String name) {

		List<WebElement> runsList = driver
				.findElements(By.xpath("//span[text()='Mikyle Louis']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> runs = new ArrayList<String>();
		for (WebElement e : runsList) {
			String text = e.getText();
			runs.add(text);
		}
		return runs;
	}

}
