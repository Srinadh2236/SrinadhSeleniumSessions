package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

//		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
//
//		Thread.sleep(3000);
//
//		By suggestion = By.xpath("//ul/li//div[@class='wM6W7d']/span");
//
//		List<WebElement> SuggList = driver.findElements(suggestion);
//
//		System.out.println(SuggList.size());
//
//		for (WebElement e : SuggList) {
//
//			String text = e.getText();
//			System.out.println(text);
//
//			if (text.contains("collect")) {
//				e.click();
//				break;
//			}
//		}

		By searchField = By.name("q");
		By suggestions = By.xpath("//ul/li//div[@class='wM6W7d']/span");

		// doSearch(searchField, suggestions,"selenium", "uses");
		// doSearch(searchField, suggestions,"Naveen automation labs", "java");

		// in case no suggestions found so exception writen latest doSearch generic
		// method in Element util.
		ElementUtil eUtil = new ElementUtil(driver);
		// eUtil.doSearch(searchField, suggestions, "selenium", "eee");
		eUtil.doSearch(searchField, suggestions, "tradingview", "banknifty");

		// driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/table/tbody/tr[1]/td/div[2]/div/div/div/h3/a")).click();
		driver.navigate().to("https://in.tradingview.com/symbols/NSE-BANKNIFTY/technicals/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(
				"#js-category-content > div.tv-react-category-header > div.js-symbol-page-header-root > div > div > div > a"))
				.click();
	}

	static WebDriver driver;

	public static void doSearch(By searchField, By suggestions, String searchKey, String matchValue)
			throws InterruptedException {

		boolean flag = false;
		driver.findElement(searchField).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> SuggList = driver.findElements(suggestions);

		System.out.println(SuggList.size());

		for (WebElement e : SuggList) {

			String text = e.getText();
			System.out.println(text);

			if (text.contains(matchValue)) {
				e.click();
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(matchValue + "is found");

		} else {
			System.out.println(matchValue + "is not found");
		}
	}

}
