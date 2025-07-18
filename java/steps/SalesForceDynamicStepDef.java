package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.baseclass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceDynamicStepDef extends baseclass{
	
	@When("the user clicks the dropdown arrow icon from the Accounts tab")
	public void the_user_clicks_the_dropdown_arrow_icon_from_the_accounts_tab() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[5]")).click();
		Thread.sleep(3000);
	}
	@When("the user clicks the New Account button")
	public void the_user_clicks_the_new_account_button() throws InterruptedException {
		driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();
		Thread.sleep(3000);
	}
	@When("the user enters the Account name as (.*)$")
	public void the_user_enters_the_account_name_as_anjali(String acctname) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(acctname);
		Thread.sleep(2000);
		
	}
	@When("the user select the ownership as (.*)$")
	public void the_user_select_the_ownership_as_public(String ownership) throws AWTException, InterruptedException {
		WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		driver.executeScript("arguments[0].click()", ownershipDD);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	@Then("the user clicks the Save button")
	public void the_user_clicks_the_save_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(3000);
	}
	@Then("the user verifies the account name")
	public void the_user_verifies_the_account_name() {
		String VerifyName=driver.findElement(By.xpath("//div[contains(text(),'Anjali')]")).getText();
		System.out.println(VerifyName);
		if(VerifyName.contains("Anjali")) {
			System.out.println("Verify Name is displayed");
		}
		else {
			System.out.println("Verify Name is Not displayed");
			
		}
	}
	

	
}
