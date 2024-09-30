import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("MacBook pro");//search filed entering 
		//xpath getting 1/20 so need to get 1 of 1 added form with class name header-form-search
		//driver.findElement(By.xpath("//*[local-name()='svg' and @fill='none']")).click();// search icon clicking
		driver.findElement(By.xpath("//form[contains(@class,'header-form-search')]//*[local-name()='svg' and @fill='none']")).click();
		
		
	}

}
