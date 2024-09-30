package acctionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	By sourceElement=	By.xpath("//div[@id='draggable']");
	By targetElement=	By.xpath("//div[@id='droppable']");
	Actions act = new Actions(driver);
	//Action drapAndDrop =
			act.clickAndHold(driver.findElement(sourceElement))
		.moveToElement(driver.findElement(targetElement))
			.release()
			.build().perform();// build:combine all actions  ready to perform in sequence and returns the action 
	//drapAndDrop.perform();
	//only build();----no work
	//only perform();----will work
	//build() --return the action -- can be re useabilty
	
	//it will not work but aim is to reusasability  of action
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
	//drapAndDrop.perform();// reuseability of action
	
	///what is Actions:class -is used to achive the builder pattern using method chaining to perform various actions in sequence
	// Action:interface -build() will return the Action(singel or composite)- which can be used later
	
	act.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
	}

}
