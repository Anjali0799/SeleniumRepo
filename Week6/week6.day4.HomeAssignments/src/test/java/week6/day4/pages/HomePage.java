package week6.day4.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class HomePage extends CommonMethods{
	
	@When("the user clicks the App Launcher icon")
	public HomePage clickapplaunchericon() throws InterruptedException {
	   getDriver().findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	   Thread.sleep(3000);
	   return this;
	}
	@When("the user clicks the viewall link")
	public ViewallPage clickviewalllink() throws InterruptedException {
		getDriver().findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(3000);
		return new ViewallPage();
		
		
	}
}