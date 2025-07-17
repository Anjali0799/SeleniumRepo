package pages;

import org.openqa.selenium.By;

import base.CommonMethods;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends CommonMethods{
	
	@Then("the user verify the status of lead creation")
	public void ViewLeadsPages() {

		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
			
			
		}

	}

}


