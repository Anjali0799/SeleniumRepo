package week6.day4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class EditPage extends CommonMethods{
	
	@When("the user set type as Technology Partner")
	public EditPage clickusertypeastechnologypartner() {
		WebElement typeDD = getDriver().findElement(By.xpath("//button[@aria-label='Type']"));
		getDriver().executeScript("arguments[0].click()",typeDD);
		getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
		return this;
	}
	@When("the user set Industry as Healthcare")
	public EditPage clickuserindustryashealthcare() {
		WebElement industryDD = getDriver().findElement(By.xpath("//button[@aria-label='Industry']"));
		getDriver().executeScript("arguments[0].click()",industryDD);
		getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
	    return this;
	}
	@When("the user enters the Billing Address as (.*)$")
	public EditPage the_user_enters_the_billing_address_as(String billingStreet) {
		 WebElement biilingStreet = getDriver().findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
	        biilingStreet.clear();
	        biilingStreet.sendKeys(billingStreet);
	        return this;
	}
	@When("the user enters the Shipping Address as (.*)$")
	public EditPage the_user_enters_the_shipping_address_as(String shippingstreet) {
		WebElement shippingStreet = getDriver().findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        shippingStreet.clear();
        shippingStreet.sendKeys(shippingstreet);
		return this;
	}
	@When("the user set customerpriority as low")
	public EditPage clickusersetcustomerpriorityasLow() {
		WebElement priorityDD = getDriver().findElement(By.xpath("//button[@aria-label='Customer Priority']"));
		getDriver().executeScript("arguments[0].click()",priorityDD);
		getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
		return this;
	}
	@When("the user set SLA as Silver")
	public EditPage clickusersetslaasSilver() {
		getDriver().findElement(By.xpath("//button[@aria-label='SLA']")).click();
		getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
		return this;
	}
	@When("the user set Active as NO")
	public EditPage clickusersetactiveasno() throws InterruptedException {
		 WebElement activeDD = getDriver().findElement(By.xpath("//button[@aria-label='Active']"));
		 getDriver().executeScript("arguments[0].click()",activeDD);
	        Thread.sleep(1000);
	        getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
			return this;
	}
	@When("the user enters the unique number in the Phno as (.*)$")
	public EditPage the_user_enters_the_unique_number_in_the_phno_as(String phno) {
		WebElement phnoField = getDriver().findElement(By.xpath("//input[@name='Phone']"));
        phnoField.clear();
        phnoField.sendKeys(phno);
		return this;
	}
	@When("the user set Upsell Opportunity as No")
	public EditPage clickusersetupsellopportunityasNo() {
		WebElement upsellOpportunityDD = getDriver().findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
		getDriver().executeScript("arguments[0].click()",upsellOpportunityDD);
		getDriver().findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
		return this;
	}
	@Then("the user clicks Save")
	public AccountPage1 clickssavebutton() throws InterruptedException{
		getDriver().findElement(By.xpath("//button[@name='SaveEdit']")).click();
	     Thread.sleep(2000);
		return new AccountPage1();
	}
	

}
