package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutorPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// javaScriptExecutor js = (javaScriptExecutor)driver;

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();

		System.out.println(title);
		
		
		// js scripts
		
		//history.go(-1)   // back   in browser 
		//history.go(1)    // forword
		//history.go(0)		// refresh
		
		
		//document.body.style.zoom= '400%'	 -- zoom 400%
		//document.body.style.zoom= '400%'	 -- zoom 100%
		
		//window.scroll(0,500); ---- scroll 500 pixcel from 0 pixels
		//window.scroll(0,document.body.scrollHeight); ---- bottom of the page to the footer
		
		//window.scroll(document.body.scrollHeight,0);  ---- to the top of the page
		
		//window.scroll(0,document.body.scrollHeight/2);  --- middle of the page
		
		//window.scroll(0,document.body.scrollHeight/4);  ----
		
		}

}
