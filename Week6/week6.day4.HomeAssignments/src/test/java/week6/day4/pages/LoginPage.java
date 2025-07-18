package week6.day4.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class LoginPage extends CommonMethods{
	
	@When("the user enters the username as {string}")
	public LoginPage enterUsername(String uname) {
		System.out.println("Driver value from pages package"+getDriver());
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	@When("the user enters the password as {string}")
	public LoginPage enterPassword(String pword) {
		getDriver().findElement(By.id("password")).sendKeys(pword);
		return this;

	}
	@When("the user clicks the login button")
	public HomePage clickLoginButton() {
		getDriver().findElement(By.id("Login")).click();
		return new HomePage();

	}
}

