package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath_1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//xpath: address of the element in the DOM
		
		//DOM : always HTML +XML
		
		//1.absolute xpath:Complete xpath :/html/body/div[2]/div/div/div/div[2]/div/form/input 
		     //if any changes in div or any form or shifted so in that case it will not work
		//2.relative xpath:relative attributes of the element :id class name text tye
		
		//formula for relative xpath
		    //htmltaf[@attr='value']
		//input[@id='input-email']---1 recommend 
		//input[@name='email']-----1 recommend
		//input[@type='text'] ----2 will not recommend this one it should always one of one only not two
		
		//htmltaf[@attr='value' and @atte='value']   // and with attributes 
		
		//input[@id='input-email' and @name='email']-----1
		//input[@id='input-email' and @name='email' and @placeholder='E-Mail Address']---1
		
		//input[@type='text'] --2 here i got two suggestions so i want to filter it one  i will use and option
		//input[@type='text' and @name='email']-----1
		
		//text():
		
		//html[text()='value']
		
		//a[text()='Register']
		
		//h2[text()='New Customer']
		
		//h2[text()='Returning Customer']
		
		//label[text()='E-Mail Address']
		
		
		//Or  approch is bad
		
		//input[@id='input-email' or @name='email']-----3  is bad approach we will use only and approach only

		
		//how many links are available in this page 
		//a
		//a[@href] -- 81
		//a[not(@href)]  -- which are not having href it means links 
		//img
		//h1
		//h2
		//input 
		//input[@id] ---all inputs having the id --6
		//-----------------------------------------------------------
		//contains():
		//htmltag[contains(@attr,'value')] -----formula
		//input[contains(@id,'firstname')]--1
		//input[contains(@id,'password')]---1
		//a[contains(@href,'newsletter')] ---2
		//a[contains(@href,'path=17')] ----1  ---software button xpath
		
		//htmltag[contains(@attr1,'value' and contains(@attr2,'value'))]------ CONTAINS AND CONDITION
		//input[contains(@id,'input') and contains(@name,'last')]---1 for last name in register page
		
		//htmltag[contains(@attr,'value) and attr2='value'] -------formula and condtion with attr equals
		//input[contains(@name,'name') and @id='input-firstname'] -----1-- for first name
		//input[@id='input-firstname' and contains(@placeholder,'Name') and @name='firstname'] ---1 same but diffrest sequences doesnt matter
		
		//------------------------------------------------------------
		//contains() with text():
		//formula:
		//htmltag[contains(text(),'value')]
		//h1[contains(text(),'Account')] -----1 ---- for register account header
		////p[contains(text(),'shop faster')] ---1 ---for  big text in register page
		//legend[contains(text(),'Personal')]----1 --- personal details in register page
		
		//lets take on example every time id last number changing so what will you , create xpath
		//Dynamic IDs/attributes developer some time ther will keep on change the id and names to prevent automations
	//Example 1:
		// <input "id=firstName_123">
		// <input "id=firstName_456">
		//<input "id=firstName_789">	
		
		//input[contains(@id,'firstName_')]------1 
		
		//example 2:
		//<spam "type=text" your transaction id is 	1234 /span>
		//span[contains(text(),'your transaction id is')]----1
		
		//-------------------------------------------------------------------
		//contains() with attribute and no contains text:
		//FORMULA:
		//htmltag[contains(@attr,'value') and text()='value'] 
		
		//a[contains(@href,'wishlist') and text()='Wish List'] ---2
		
		//---------------------------------------------------------------------
		
		//contains() with attribute and  contains() text:
				//FORMULA:
		//htmltag[contains(@attr,'') and contains(@attr2,'value')]
		//a[contains(@href,'wishlist') and contains(text(),'Wish List')]---2
		
		//-----------------------------------------------------------------------
		
		//starts-with():
		//FORMULA:
		//htmltag[starts-with(@attr,'value')]
		//input[starts-with(@placeholder,'First')]
		//h1[starts-with(text(),'Register')]
		
		//ends-with(): is not available(NA)
		
		//=========================================================================
		//*******vIMP*******************
		//class
		
		//class="form-control private-form__control login-email"
		
		//class are separated by spaces in this 3 class are there
		
		
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		
		//will it work??? we are given three classes in clasname
		//NO: it will throw an exception::::::InvalidSelectorException:
		//it will allow only one className should be used 
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("text@gmail.com");
		//by using xpath we can give full class name having more classes not a problem
		
		
		//by usin contains xpath: same above here we are using contains method
		//VALID xpath
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test@gmail.com");
		//input[contains(@class,'login-email')] 
		
		//VALID 
		//driver.findElement(By.className("login-email")).sendKeys("yest@gmail.com");
		
		//INTERVIEW QUESTION GIVEN XPATH TOTALY WRONG what is error 
		//InvalidSelectorException: syntax wise wrong xpath it will give you invalid selector exceptiom
		//driver.findElement(By.xpath("//input[@@@@@id,testing/test/option")).sendKeys("test@gmail.com");

		//here systax wise correct but id is given wornd 111 so it will give you what???
		//NoSuchElementException: if syntax correct but given id is wrong so it will give you nosuchelementexception
		//driver.findElement(By.xpath("input[@id='username1111']")).sendKeys("test@gmail.com");
		
		//==============================================================================================
		
		//indexing in xpath: index start with 1
		//it is called capture group and then supply the index value
		//      (//input[@type='text'])[1]----search field
		//      (//input[@type='text'])[2]-----first name
		//       (//input[@type='text'])[3]-----last name
		
		
		//eg:2
		
		//       (//a[text()='Forgotten Password'])[1]
		//        (//a[text()='Forgotten Password'])[2]
		
		
		//eg:3
		
		//        (//input[@class='form-control'])[1]
		//        (//input[@class='form-control'])[2]
		//		  (//input[@class='form-control'])[3]
		//		  (//input[@class='form-control'])[4]
		//		  (//input[@class='form-control'])[last()-1] 
		//  	  (//input[@class='form-control'])[last()] ---- here we can write last function it will give you last index value
		
		//        (//input[@class='form-control'])[position()=1] ---- also we can write positioning 
		//        (//input[@class='form-control'])[position()=last()]---- it wi;; give you last index
		
		//
		//====================================================================================
			//in amazon footer links help link is ther are not  last write x path for that
		
		//    (//div[@class='navFooterVerticalRow navAccessibility']/div//ul/li/a)[1]----- About Us
		//    (//div[@class='navFooterVerticalRow navAccessibility']/div//ul/li/a)[last()]----help
		
		
		/// xpath asssignment for login page side panel
		//       (//div[@class='list-group']/a)[1]
		//       (//div[@class='list-group']/a)[last()]
		
		
		//===================================================================================
		
		//Normalize spaces like trim,  if yes having space when we use             yes = //lable[text()='Yes'] it wnt work 
		
		//label[normalize-space()='Yes'] -------1
		//label[normalize-space()='No'] ---------1 ----reg page yes and no radio buttons
		
		
		
	}
}
