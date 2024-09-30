import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		
		JavaScriptUtil js= new JavaScriptUtil(driver);// my code need scroll little bit so i used header 
		js.scrollToElemet(driver.findElement(By.xpath("//h6[contains(text(),'Forecasts Every 30 Days')]")));
		//naveen did manually so i used js to little bit low scroll

		// there is a iframe need to switch .
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region' ]//*[name()='path']";
		
		Thread.sleep(1000);
		List<WebElement> stateList = driver.findElements(By.xpath(svgXpath));
		System.out.println(stateList.size());

		Actions act = new Actions(driver);

		for (WebElement e : stateList) {
			act.moveToElement(e).perform();

			String nameAttr = e.getAttribute("name");// in  html tag name:"California"; getting data by using getAtteribute
			System.out.println(nameAttr);
			if (nameAttr.contains("California")) {
				act.click(e).perform();
				break;
			}
			Thread.sleep(1000);
		}
	}

}
