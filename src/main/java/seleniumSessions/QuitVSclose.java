package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSclose {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();//session id:14cc
		
		driver.get("https://www.google.com");//14cc
		String title =driver.getTitle();
		System.out.println(	title);//14cc
		
		driver.quit();//session id: 14cc . once quit the browser the session will be null.
		//driver.close();// same session id
		
		//if i want to run this what we ll do , launch chrome driver thats it.
		
		driver = new ChromeDriver();//2ae2a
		
		driver.get("https://www.amazon.com");// null , for close(); session id is invalid:close();
		
		String title1=driver.getTitle();//2ae2a
		
		System.out.println(title1);
		
		//int i =10;
		//      i=20;
	}

}
