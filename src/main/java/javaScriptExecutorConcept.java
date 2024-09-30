import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {

		// java --js code ---JavascriptExecutor(i)-----executorSCript(js)
		// topcasting
		driver = new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		// interface casting interface to interface webdriver interface to
		// javascriptexecutor interface
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String title = js.executeScript(" return document.title;").toString();
//		System.out.println(title);
//
//		// two ways to get page title
//		// 1.driver.getTitle()
//		// 2.by using JavaScript to get title
//		String PageURL = js.executeScript("return document.URL").toString();
//
//		System.out.println(PageURL);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		
		String title=jsUtil.getPageTitle();
		String Url = jsUtil.getPageURL();
		
		System.out.println(title);
		System.out.println(Url);
		
		
		//jsUtil.generateJsAlert("Welcome to JavaScript alert");
	String text=	jsUtil.getPageInnerText(); //it will give all text in current page
	System.out.println(text);
	driver.manage().window().maximize();
	jsUtil.zoomChromeEdgeFirefox("200%");
	Thread.sleep(2000);
	jsUtil.zoomChromeEdgeFirefox("100%");
	jsUtil.pageRefreshWithJS();
	
	jsUtil.scrollPageDown("400");//scrolled page top 0 to 400 pixels;
	jsUtil.scrollPageDown("700");
	Thread.sleep(3000);
	jsUtil.ScrollPageUp();
	Thread.sleep(3000);
	jsUtil.scrollBottomPage();
	Thread.sleep(2000);
	jsUtil.ScrollMiddlePage();
	
	if(text.contains("Newsletter")) { //text should be there in the page like wise will test.
		System.out.println("Pass");
	}
	else{
		System.out.println("Fail");
	}
	
	WebElement ele = driver.findElement(By.xpath("//h3[text()='Print & SMS']"));
	scrollToElemet(ele);
	
	jsUtil.drawBorder(ele);//drawin border 
	WebElement ele2 = driver.findElement(By.xpath("//form[@id='loginForm']"));
	jsUtil.drawBorder(ele2);
	
	
	
	
	
	}
	
	static WebDriver driver;
public static void scrollToElemet(WebElement element) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", element);
}
	
	public static String getTitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript(" return document.title;").toString();
		return title;
	}
	
	
	public static String getURL() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String PageURL = js.executeScript("return document.URL").toString();
		return PageURL;
	}
	
}

