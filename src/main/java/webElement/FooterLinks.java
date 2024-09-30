package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By footerLinks = By.xpath("//div[@class='col-sm-3']/ul/li/a"); 
		//By tagNam=By.tagName("a");

//	List<WebElement>  attri=	driver.findElements(tagNam); // for all links
//	
//	for(WebElement e:attri) {
//		String hrf=e.getAttribute("href");
//		String txt =e.getText();
//		if(txt.length()!=0 && txt.length()==0) {
//		System.out.println(txt+" :"+hrf);
//		}
//	}
	
		ElementUtil eUtil = new ElementUtil(driver);

		List<String> footerLinkList = eUtil.getElementsTextList(footerLinks); // perticular footer links only

		for (String e : footerLinkList) {
			System.out.println(e);	
		}
		
		System.out.println("FooterLinks text Count: " + eUtil.getElementsCount(footerLinks));

	}

}
