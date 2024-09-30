import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		
		//typer= file should be there 
		WebElement chooseFile=	driver.findElement(By.xpath("//input[@name='upfile']"));
		
		chooseFile.sendKeys("C:\\Users\\91996\\Downloads\\HDFC BANK PASS BOOK.jpg");
		
		
		
		
		
	}

}
