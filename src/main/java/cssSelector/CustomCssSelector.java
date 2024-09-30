package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {

	public static void main(String[] args) throws InterruptedException  {

			WebDriver driver = new ChromeDriver();
			
			//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			//By.cssSelector("#input-email");
			
			driver.get("https://app.hubspot.com/login");
			
			//for id----#
			//id
			//#id
			//#input-email ---- for login page emai address text field css selector
			
			//tag#id
			//input#input-email   --- both can we can use
			
			
			//Class
			//.className
			//.form-control
			//tagname.classname
			//input.form-control
			
			//C1.C2.C3.C4.....Cn
			//.form-control.private-form__control.login-email
			//input.form-control.private-form__control.login-email     both are same we can use tagname also
			
			
			//id and class
			//   #id.class
			//   #username.login-email
			//or
			//   .login-email#username
			//or
			// input#username.login-email
			
			
			//tagne.C1#id.C2.C3 also we can write there is no rules to write c
			
			//for any attribute in css selector:
			//  tagname[attr='']
			//  input[type='email']
			//  input[id='username']  for id also we can use
			//  input[placeholder='E-Mail Address'] 
			
			// input[name='email']------CSS
			//input[@name='email']------XPATH
			
			// input#input-email[name='email']
			// input.form-control[name='email']
			// #input-email.form-control[name='email'] ----id class attribute
			
			//formula 
			// tagname[attr2='value'][attr2='value'][attr3='value']...........[attrN='value']
			
			
			//text in css :no support for text in CSS
			
			//Contains:*
			 //    input[placeholder*='Mail']
			//     input[placeholder*='Address']
			
			
			//Starts-with:  ^
			//tagname[attr^='startsvalue']
			//input[placeholder^='E-Mail']
			
			
			//ends-with:  $
			// tagname[attr='endsValue']
			// input[placeholder$='Address']
			
			
			//parent and  indirect child : parentTag childTag (direct + indirect )
			//  form#hs-login input#username
			
			//parent and direct child: parentTag childTag
			// 
			// form#hs-login>div  ---8           --div direct child
			// form#hs-login div   --23  		---div direct + indirect div
			
			// select#Form-getForm-Country > option      direct childs
			
			
			// form a   -----got all footer links in 
			
			
			//child to parent: not available in CSS 
			
			//sibling in CSS: only for following sibling allowed 
			//following sibling :  +
			// label[for='input-email'] + input    ----immediate following sibling
			
			// following sibling all : ~  ----following siblings 
			
			// indexing in css
			//====================================================================
			
			//   #Form_getForm_Country >option : nth-of-type(9)  -------9th option
			//   #Form_getForm_Country >option:nth-of-type(8)      ----8th option
			 //  #Form_getForm_Country >option:nth-of-type(n)     -------all options
			
			//   #Form_getForm_Country>option:first-child
			//   #Form_getForm_Country>option:last-child 
			
			//    #Form_getForm_Country>option:nth-child(5)
			//    #Form_getForm_Country>option:nth-child(77)
			
			// 	  #Form_getForm_Country>option:nth-last-child(2)
			//    #Form_getForm_Country>option:nth-last-child(3)
			//    #Form_getForm_Country>option:nth-last-child(5)
			
			
			//    #Form_getForm_Country>option:nth-child(n+2) ----it will start form 4th option
			//		#Form_getForm_Country>option:nth-child(n+4)
			
			//     #Form_getForm_Country>option:nth-child(4n)    ----4th multiplication
			
			
			// in css odd and even
			//====================================================================
			
			//	  #Form_getForm_Country >option:nth-child(odd) ----------only odd will come
			//    #Form_getForm_Country >option:nth-child(even) ---------only even will come
					
			// in xpath odd and even
			//========================================================================
			// 10 % 2 ==0 even
			//  9% 2 ==1  odd
			
			//  //select[@id='Form_getForm_Country']/option[position() mod 2=1] -----odd
			//   //select[@id='Form_getForm_Country']/option[position() mod 2=0] ----even
			
			// comma in css:
			//===============================================================================
			//    input#username,input#password     -----writing two css commands in single line we can write more also
			//    input#username,input#password , button#loginBtn , input#remember   -----4 commands in one line like sanity testin
		
			Thread.sleep(2000);
		int impEleCount	=driver.findElements(By.cssSelector("input#username,input#password , button#loginBtn , input#remember")).size();
			
		System.out.println("size of elemets: "+impEleCount);
		if (impEleCount==4) {
			System.out.println("imp elements all are present:sanity testin Passed");
			
		}
		else {
			System.out.println("elements are missing");
			
		}
		
		
		// not in CSS :
		//========================================================================
		//   input.form-control:not(input[name='search'] ----- here we are excluding the search bar 
		//   input.form-control:not(input[name='search']):not(#input-password)  --- and password also excluding
		
		//   div.navFooterLinkCol.navAccessibility:not(div.navFooterColSpacerInner.navAccessibility) --- excluding footer space 
		
		
		//  //div[text()='Get to Know Us']/following-sibling::ul//a     ---- amazon footer link text for one column 
		 
		// Comparison 
		//				xpath 					css
		//1.syntax      complex				easy    
		//2.perfomance   good 				good
		//3.text         yes				no
		//4.sibling     yes 				limited only forword
		//5.child to parent yes 			no
		//6.child to ancestors yes   		no
		//7.index       yes 				yes (+2) 
		//8.not 		yes 				yes
		//9.comma/union		limited         yes
		//10.space  	yes	 				no
		//11.SVG 		YES 				NO
		//12.SHADOW DOM 	NO 				YES
		//13.ends with 		no 				yes
		
		
		
		
			//for id:#
			//class: .
			//contains: *
			//starts-with : ^
			// parent and indirect child: space
			//parent and direct child:  >
			// following sibling :  +
			// following all sibling :  ~
		
		
	}

}
