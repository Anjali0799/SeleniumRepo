package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceStaticStepdef extends baseclass{
	
	/*@Given("the user search as {string}")
	public void the_user_search_as(String uname) throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys(uname);
		Thread.sleep(3000);
	}*/
	@Given("the user clicks the Account link")
	public void the_user_clicks_the_account_link() throws InterruptedException {
		WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()",accountsTab);
        Thread.sleep(5000);
	}
	/*@Then("user should be navigated to the Accounts page")
	public void user_should_be_navigated_to_the_accounts_page() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
	}*/
	@Then("the user search the account search box as {string}")
	public void the_user_search_the_account_search_box_as(String accountname) throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accountname);
        //Thread.sleep(1000);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	/*@Then("the user clicks search account")
	public void the_user_clicks_search_account() throws InterruptedException {
		WebElement  Clickfirtrowvalue=driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
        driver.executeScript("arguments[0].click()", Clickfirtrowvalue);
        Thread.sleep(1000);
	}*/
	@Then("the user clicks the arrow icon from dropdown")
	public void the_user_clicks_the_arrow_icon_from_dropdown() throws InterruptedException {
		WebElement  Clickfirtrowvalue=driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
        driver.executeScript("arguments[0].click()", Clickfirtrowvalue);
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//table/tbody/tr[1]/th[6]")).click();
        //driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"))
	}
	@Then("the user clicks the Edit option")
	public void the_user_clicks_the_edit_option() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Edit']")).click();//a[@title='Edit']
        Thread.sleep(2000);
	}
	@Then("user should be navigated to the Edit page")
	public void user_should_be_navigated_to_the_edit_page() throws InterruptedException {
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
	}
	@When("the user set type as {string}")
	public void the_user_set_type_as(String string) throws InterruptedException {
		WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
        driver.executeScript("arguments[0].click()",typeDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
	}
	@When("the user set Industry as {string}")
	public void the_user_set_industry_as(String string) {
		WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
        driver.executeScript("arguments[0].click()",industryDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
	}
	@When("the user enters the Billing Address as {string}")
	public void the_user_enters_the_billing_address_as(String billingStreet) {
		 WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
	        biilingStreet.clear();
	        biilingStreet.sendKeys(billingStreet);
	}
	@When("the user enters the Shipping Address as {string}")
	public void the_user_enters_the_shipping_address_as(String shippingstreet) {
		WebElement shippingStreet = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        shippingStreet.clear();
        shippingStreet.sendKeys(shippingstreet);
	}
	@When("the user set customerpriority as {string}")
	public void the_user_set_customerpriority_as(String string) {
		WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
        driver.executeScript("arguments[0].click()",priorityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
	}
	@When("the user set SLA as {string}")
	public void the_user_set_sla_as(String string) {
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	}
	@When("the user set Active as {string}")
	public void the_user_set_active_as(String string) throws InterruptedException {
		 WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
	        driver.executeScript("arguments[0].click()",activeDD);
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}
	@When("the user enters the unique number in the Phno as {int}")
	public void the_user_enters_the_unique_number_in_the_phno_as(Integer phno) {
		WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(Integer.toString(phno));
	}
	@When("the user set Upsell Opportunity as {string}")
	public void the_user_set_upsell_opportunity_as(String string) {
		WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	}
	@Then("the user clicks Save")
	public void the_user_clicks_save() throws InterruptedException{
		 driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	     Thread.sleep(2000);
	}
	@Then("user should Verify the Phno")
	public void user_should_verify_the_phno() {
		String phnoStr = driver.findElement(By.xpath("//td[@data-label='Phone']")).getText();
        System.out.println(phnoStr);
	}
	
}