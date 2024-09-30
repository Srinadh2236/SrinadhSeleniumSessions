import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		Thread.sleep(4000);
		
		
		//browser -->page-->shadow dom-->input#id
		
		//using JavaScript have to come
		
		String jsPath="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement pizza=(WebElement)js.executeScript(jsPath);//js.executeScript("jsPath"); returning the html Element --> converting into webelement
		
		pizza.sendKeys("Veg Pizza");
		
		//shadow DOM:
		//xpath is not support
		//only CSS with JSpath
		
		//SVG :special path
		  //parent: *[local-name()='svg']
			//child  svg or g or path : *[name()='g']   
		
		
		
		}

}
