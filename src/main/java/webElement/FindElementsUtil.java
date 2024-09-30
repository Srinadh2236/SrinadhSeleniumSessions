package webElement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// driver.get("https://www.flipkart.com/");

		// this is how we manually write , so we create generic method for findelements

		// List<WebElement> imglist=driver.findElements(By.tagName("img"));
		// List<WebElement> linkList=driver.findElements(By.tagName("a"));

		By image = By.tagName("img");
		By links = By.tagName("a");

		List<WebElement> imgList = getElements(image);// method calling
		List<WebElement> linkList = getElements(links);

		// here we will create generic function for count
		// int imgCount =imgList.size();
		// int linkCount=linkList.size();

		int LinksCount = getElementsCount(links);// getElementsCount(); ,method calling
		System.out.println("total links in login page: " + LinksCount);

		int imgCount = getElementsCount(image);
		System.out.println("total Images count in login page " + imgCount);

		List<String> eleText = getElementsTextList(links);// this will help for wheather links is there or nort

		System.out.println(eleText.contains("About Us")); // if its there return boolen true or flase
		System.out.println(eleText.contains("Returns"));

		// System.out.println(eleText); it will print in array format[all links name
		// sparated by , ]

		// for print purpose all so want to create gerenic method so that i can call
		// easyly right.
//		for (String e:eleText) {
//			System.out.println(e);
//		}

		printElementsTextList(links);
		printElementsTextList(image);// no data images found in

	}

	static WebDriver driver;

	public static void printElementsTextList(By loactor) {
		List<String> eletext = getElementsTextList(loactor);
		for (String e : eletext) {
			System.out.println(e);
		}
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);

		List<String> eleTextList = new ArrayList<String>();// fresh array list to store one bye one

		for (WebElement e : eleList) {
			String eleText = e.getText();
			if (eleText.length() != 0) {
				eleTextList.add(eleText);// here new array list called and added to one bye one. stored in eleTextList
			}
		}
		return eleTextList;
	}

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
