package week6.day4.runner;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import week6.day4.base.CommonMethods;
import week6.day4.pages.LoginPage;

public class TC002_SalesForce extends CommonMethods{
	
	@BeforeTest
	public void setFilePath() {
		
     filePath="SalesAccountsEdit";
     sheetName="Sheet1";
     
	}
	@Test(dataProvider = "fetchData")
	public void runSalesForce(String username, String password, String billingaddress, String shippingstreet, String phno) throws InterruptedException, AWTException {

		LoginPage user = new LoginPage();
		 System.out.println("Driver value  OF TCOO2 "+getDriver());

         user.enterUsername(username)
		.enterPassword(password)
		.clickLoginButton()
		.clickapplaunchericon()
		.clickviewalllink()
		.clicksaleslink()
		.clicktheAccounttabmenu()
		.the_user_search_the_account_search_box_as_Anjali()
		.clickfirstmatchingname()
		.clickEditoption()
		.clickusertypeastechnologypartner()
		.clickuserindustryashealthcare()
		.the_user_enters_the_billing_address_as(billingaddress)
		.the_user_enters_the_shipping_address_as(shippingstreet)
		.clickusersetcustomerpriorityasLow()
		.clickusersetslaasSilver()
		.clickusersetactiveasno()
		.the_user_enters_the_unique_number_in_the_phno_as(phno)
		.clickusersetupsellopportunityasNo()
		.clickssavebutton()
		.user_should_navigate_to_the_Accountpage_and_verify_the_phno();;
		
	}
		
}
