import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class borderAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		jsUtil.drawBorder(driver.findElement(By.xpath("//div[@id='content']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-firstname']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-lastname']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-email']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-telephone']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-password']")));
		jsUtil.drawBorder(driver.findElement(By.xpath("//input[@id='input-confirm']")));
		
		
		WebElement flshElement =driver.findElement(By.xpath("//input[@id='input-firstname']"));
		jsUtil.flash(flshElement);
		jsUtil.flash(driver.findElement(By.xpath("//input[@id='input-lastname']")));
		jsUtil.flash(driver.findElement(By.xpath("//input[@id='input-email']")));
		jsUtil.flash(driver.findElement(By.xpath("//input[@id='input-telephone']")));
		jsUtil.flash(driver.findElement(By.xpath("//input[@id='input-password']")));
		jsUtil.flash(driver.findElement(By.xpath("//input[@id='input-confirm']")));
		
	}

}
