import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(2000);

		int framesize = driver.findElements(By.tagName("frame")).size();
		System.out.println(framesize);
		
		// frame:deprecated
		// iframe:w3c stranded
		// driver.switchTo().frame(2); //index value frame 
		// driver.switchTo().frame("main"); // name ="main";
		driver.switchTo().frame(driver.findElement(By.name("main")));
		String headerTagName = driver.findElement(By.tagName("h2")).getText();
		System.out.println(headerTagName);

	}

}
