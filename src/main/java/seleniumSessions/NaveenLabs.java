package seleniumSessions;

public class NaveenLabs {

	public static void main(String[] args) {

		BrowserUtil util = new BrowserUtil();
		util.launchBrowser("firefox");
		util.launchURL("https://naveenautomationlabs.com");

		
		
		String title =util.getPageTitle();
		System.out.println("NaveenAutomationLabs Page Title:"+title);
		if(title.contains("naveen automationlabs")) {
			System.out.println("Page title pass");
		}else {
			System.out.println("Page title fail");
		}
		
		
		
		String pageURL=util.getPageUrl();
		System.out.println("Current page URL :"+pageURL);
		if(pageURL.contains("naveenautomationlabs")){
			
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		util.quitBrowser();
		
		
		
		
	}

}
