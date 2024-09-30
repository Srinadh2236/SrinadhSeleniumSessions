package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String name ="Naveen";
//		String sb = "Automation";
//		String sf= "labs";
//		driver.findElement(By.id("input-email")).sendKeys(name+" ",sb+" ",sf);
//		
	
		//CharSequence...(I)INterface
			//1.String
			//2.StringBuffer
			//3.StringBuilder
		
		String name ="Naveen";
		StringBuffer sf = new StringBuffer("Automatoion");
		StringBuilder sb = new StringBuilder("Labs.com");
		driver.findElement(By.id("input-email")).sendKeys(name,sb,sf);//CharSequence...
		driver.findElement(By.id("input-password")).sendKeys(name," ",sb," ",sf,"Selenium");//CharSequence...
		
		
		//lets take example
		
		//address: // so here i need to enter in Address text box at that time we can use Sequence...
		
			//doorNo:1-301
			//street:ramachandraiah
			//village:vidyaNagar
			//mandal:kota
			//district:Nellore;
			//Pincode:524346
			//state:andrapradesh
			//nationality:India
		
	//	driver.findElement(By.id("input-Address")).sendKeys(doorNo,Street,village,mandal,district,pincode,state,nationality);//CharSequence...
		// here all details will be send into once address textbox.
		
		
		
		
	}

}
