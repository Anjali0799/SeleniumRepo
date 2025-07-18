package week6.day4.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import week6.day4.base.CommonMethods;

public class AccountPage1 extends CommonMethods{
	
	@Then("user should Verify the Phno")
	public AccountPage1 user_should_navigate_to_the_Accountpage_and_verify_the_phno() {
		String phnoStr = getDriver().findElement(By.xpath("//td[@data-label='Phone']")).getText();
        System.out.println(phnoStr);
        return this;
	}
	

}
