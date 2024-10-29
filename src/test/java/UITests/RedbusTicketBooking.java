package UITests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webElement.ElementUtil;

public class RedbusTicketBooking extends BaseTest {

	By sourceFrom = By.id("src");
	By SourceSuggestions = By.xpath("(//ul[@class='sc-dnqmqq dZhbJF']/li)[1]");
	By destionTo = By.id("dest");
	By destSuggestions = By.xpath("((//ul[@class='sc-dnqmqq dZhbJF']/li)[1])");
	By searchBtn = By.id("search_button");
	By date = By.id("onwardCal");
	By logo = By.xpath("//img[@class='rb_logo']");
	By dateList = By.xpath("//div[@id='onwardCal']/div//text[@class='dateText']");
	By datePick = By.xpath("//div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/div/div//div/span");
	// By seatFare=By.xpath("//div[@class='clearfix row-one']/div//div[@class='seat-fare ']/div/span");
	By seatFare = By.cssSelector(".clearfix.bus-item .clearfix.row-one .seat-fare .f-19");

	@DataProvider
	public Object[][] getSearchKey() {
		return new Object[][] { { "Nellore", "Bangalore", "31" } };
	}

	@Test(dataProvider = "getSearchKey")
	public void ticketBooking(String From, String To, String BookingDate) throws InterruptedException {

		Actions act = new Actions(driver);
		eUtil = new ElementUtil(driver);
		WebElement sfromTextfiled = eUtil.waitForElementVisible(sourceFrom, 3);
		sfromTextfiled.clear();

		doSearch(sourceFrom, SourceSuggestions, From);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		doSearch(destionTo, destSuggestions, To);

		List<WebElement> dateSelect = driver.findElements(datePick);
		// System.out.println(dateSelect.size());

		for (WebElement e : dateSelect) {
			String text = e.getText();

			if (text.contains(BookingDate)) {
				e.click();
				break;
			}
		}

		eUtil.doClick(searchBtn);

		Thread.sleep(10000);

		// scroll to bottom load the all price values
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int j = 0; j < 25; j++) {
			js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		}

		List<WebElement> fareList = driver.findElements(seatFare);
		System.out.println("Total Buses count:" + fareList.size());

		List<Double> eleTextList = new ArrayList<Double>();
		for (int i = 0; i < fareList.size(); i++) {
			Double value = Double.parseDouble(fareList.get(i).getText());
			if (value > 0) {
				eleTextList.add(value);
			}
		}

		// sorting and getting ticket low price value
		Collections.sort(eleTextList);
		System.out.println(eleTextList);
		System.out.println("Lowest ticket price :" + eleTextList.get(0).intValue());
		int lowestPrice = eleTextList.get(0).intValue();

		// scroll to top
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");

		// act.moveToElement(getElement(By.xpath("//span[text()='"+lowestPrice+"' and
		// @class='f-19 f-bold']"))).perform();
		// driver.findElement(By.xpath("//span[text()='350' and @class='f-19
		// f-bold']"));
		// act.moveToElement(getElement(By.xpath("//span[text()='350' and @class='f-19
		// f-bold']"))).click().perform();

		// manually taken by using id
		By viewSeats = By.xpath("//li[@id='32394344']//div[@class='button view-seats fr']");
		eUtil.getElement(viewSeats).click();
	}

}
