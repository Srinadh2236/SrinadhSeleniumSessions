import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String username="admin";
		String password="admin";
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auththe-internet.herokuapp.com/basic_auth");
		
		
		//Auth pop are not js alerts we cant swith to auth popups
		
		//admin:admin are username and password placed in URL
		
		//selenium 4 .x:Has Authenticated  (interface) only woriking in chrome and edge only will not work firefox 
		// hasauthentication implemented onlu chromiumdriver so will work only chrome and edge.
		
		((HasAuthentication)driver).register(()-> new UsernameAndPassword(username, password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
