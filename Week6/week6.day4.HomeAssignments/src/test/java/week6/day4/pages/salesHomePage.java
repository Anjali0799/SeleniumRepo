package week6.day4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;
import week6.day4.base.CommonMethods;

public class salesHomePage extends CommonMethods{
	
       @When("the user clicks the Account tab menu")
       public AccountsPage clicktheAccounttabmenu() throws InterruptedException {
    	   WebElement accountsTab = getDriver().findElement(By.xpath("//a[@title='Accounts']"));
    	   getDriver().executeScript("arguments[0].click()",accountsTab);
           Thread.sleep(5000);
    	   return new AccountsPage();
       }
}
