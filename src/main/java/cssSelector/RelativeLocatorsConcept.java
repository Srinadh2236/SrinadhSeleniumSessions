package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) {

//			  above
//				|
//				|
//	left ------Ele ---->right
//		        |
//		        |
//	near       below
//		        

		WebDriver driver = new ChromeDriver();

		driver.get("https://aqi.in/dashboard/canada");

		WebElement ele = driver.findElement(By.linkText("Cold Lake, Canada"));

		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);

		String auius = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(auius);

		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);

		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		String near = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(near);
	}

}
