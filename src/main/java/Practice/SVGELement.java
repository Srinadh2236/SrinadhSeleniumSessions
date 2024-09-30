package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGELement {

	public static void main(String[] args) {

		//SVG element is kind of symbols like searchIcon  round with line
		
		///so if we want write for xpath for the SVG element there will special path //*[local-name()='svg']
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=Cj0KCQjw8--2BhCHARIsAF_w1gxbHeupdSVFvTmzVW57UZEnuX_0AFh27HM7KYImrkXO7Wi_6vFhUSQaAuMKEALw_wcB");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("macbook");
		driver.findElement(By.xpath("//*[local-name()='svg' and @fill='none']")).click();
	}

}
