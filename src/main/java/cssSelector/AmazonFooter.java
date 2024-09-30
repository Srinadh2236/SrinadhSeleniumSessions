package cssSelector;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooter {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=1434265003754647683&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007741&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
    
  List< WebElement> footerlinks= driver.findElements(By.xpath("//div[text()='Get to Know Us']/following-sibling::ul//a"));
	
	for(WebElement e:footerlinks) {
	String text=	e.getText();
	System.out.println(text);
	}
	
	
	
	
	}

}
