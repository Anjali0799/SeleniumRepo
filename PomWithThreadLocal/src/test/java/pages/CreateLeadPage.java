package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadPage extends CommonMethods{
	
	@When("the user enters the company name")
	public CreateLeadPage enterCompanyName() {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		return new CreateLeadPage();
	}
	@When("the user enters the firstname")
	public CreateLeadPage enterFirstName() {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("bhuvanesh");
		return new CreateLeadPage();
	}
	@When("the user enters the lastname")
	public CreateLeadPage enterLastName() {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("moorthy");
		return new CreateLeadPage();
	}
	@When("the user enters the phoneno")
	public CreateLeadPage enterPhno() {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9818");
		return new CreateLeadPage();
	}
	@Then("the user clicks the submit button")
	public ViewLeadPage clicksCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}


