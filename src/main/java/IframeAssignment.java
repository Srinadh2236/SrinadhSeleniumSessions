import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframeAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img[@loading='lazy']")).click();
		Thread.sleep(2000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Naveen automation labs");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("Nellore");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("24/08/24");
		driver.findElement(By.xpath("//textarea[@id='RESULT_TextArea-5']"))
				.sendKeys(" Java with selenium automation labs");
		driver.findElement(By.xpath("//input[@id='RESULT_FileUpload-6']"))
				.sendKeys("C:\\Users\\91996\\Downloads\\HDFC BANK PASS BOOK.jpg");

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-8']")).sendKeys("Naveen");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-9']")).sendKeys(" Automation labs");

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-10']")).sendKeys("street address");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-11']")).sendKeys("My address");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-12']")).sendKeys("Nellore");

		WebElement state = driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-13']"));
		Select select = new Select(state);
		select.selectByVisibleText("New York");

		// OR get all options and equals to then select the String

//		List<WebElement> stateOptions = select.getOptions();
//		for (WebElement e : stateOptions) {
//			String text = e.getText();
//			System.out.println(text);
//			if (text.equals("New York")) {
//				e.click();
//				break;
//			}
//		}

		//

		driver.findElement(By.xpath("//input[@id='RESULT_TextField-14']")).sendKeys("500001");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-15']")).sendKeys("9998884444");
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-16']")).sendKeys("naveen@gmail.com");

	}

}
