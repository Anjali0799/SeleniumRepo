package week6.day4.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class ViewallPage extends CommonMethods{
	
	@When("the user clicks the Sales link")
	public salesHomePage clicksaleslink() throws InterruptedException {
		getDriver().findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(4000);
		return new salesHomePage();
		
		
	}

}
