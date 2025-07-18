package week6.day4.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class AccountsPage extends CommonMethods{
	
	@When("the user search the account search box as Anjali")
	public AccountsPage the_user_search_the_account_search_box_as_Anjali() throws AWTException, InterruptedException {
		getDriver().findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Anjali");
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		return this;
	}
	@When("the user clicks the first matching name")
	public AccountsPage clickfirstmatchingname() throws InterruptedException {
		WebElement  Clickfirtrowvalue=getDriver().findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
        getDriver().executeScript("arguments[0].click()", Clickfirtrowvalue);
        Thread.sleep(4000);
		return this;
	}
	@When("the user clicks the Edit option")
	public EditPage clickEditoption() throws InterruptedException {
		getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        Thread.sleep(8000);
		return new EditPage();
	}

}
