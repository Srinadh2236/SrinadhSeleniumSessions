package seleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.launchBrowser("chrome");
		
		brUtil.launchURL("https://www.amazon.com");
	
		String title =brUtil.getPageTitle();		
		System.out.println(title);
		if(title.contains("Amazon")) {
			System.out.println("title Pass");
		}
		else {
			System.out.println("title fail");
		}
		
		
		System.out.println(brUtil.getPageUrl());
		
		brUtil.quitBrowser();
		
		
		
	}

}
