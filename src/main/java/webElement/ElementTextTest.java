package webElement;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header =By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgorPwdTxt=By.linkText("Forgotten Password");
		By footerTxt =By.xpath("/html/body/footer/div/div/div[1]/h5");
		
		ElementUtil eUtil = new ElementUtil(driver);
		String m1=	eUtil.getElementText(header);
		String m2=	eUtil.getElementText(para);
		String m3=	eUtil.getElementText(forgorPwdTxt);
		String m4=	eUtil.getElementText(footerTxt);

		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		
		
	}

}
