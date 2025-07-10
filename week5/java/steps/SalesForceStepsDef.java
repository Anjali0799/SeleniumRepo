package steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceStepsDef {
      ChromeDriver driver;
      
	@Given("the user establishes the environment")
	public void the_user_establishes_the_environment() {
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("guest");    
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given("the user loads the url")
	public void the_user_loads_the_url() {
		driver.navigate().to("https://login.salesforce.com/");
	}
	@When("the user enters the username as bhuvanesh.moorthy@testleaf.com")
	public void the_user_enters_the_username_as_bhuvanesh_moorthy_testleaf_com() {
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
	}
	@When("the user enters the password as Leaf@{int}")
	public void the_user_enters_the_password_as_leaf(Integer int1) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@2025");
		
	}
	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	@Then("the user should be navigated to the welcome page")
	public void the_user_should_be_navigated_to_the_welcome_page() {
	    String title=driver.getTitle();
	    System.out.println(title);
	    
	}
	@When("the user clicks the toggle menu button from the left corner")
	public void the_user_clicks_the_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
	}
	@When("the user clicks the View All from the App Launcher")
	public void the_user_clicks_the_view_all_from_the_app_launcher() {
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("the user clicks the Sales from the App Launcher")
	public void the_user_clicks_the_sales_from_the_app_launcher() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
	}
	@When("the user clicks the Accounts tab menu")
	public void the_user_clicks_the_accounts_tab_menu() {
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[5]")).click();
	}
	@When("the user clicks the New Account button from the Accounts tab")
	public void the_user_clicks_the_new_account_button_from_the_accounts_tab() {
		driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();

	}
	@When("the user enters the Account name as Anjali")
	public void the_user_enters_the_account_name_as_anjali() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Anjali");
	}
	@When("the user select the Public for Ownership")
	public void the_user_select_the_Public_for_ownership() throws AWTException, InterruptedException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	    
	}
	@When("the user clicks the save button")
	public void the_user_clicks_the_save_button() {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("the user should be navigate to the Account page")
	public void the_user_should_be_navigate_to_the_account_page() {
		String VerifyName=driver.findElement(By.xpath("//div[contains(text(),'Anjali')]")).getText();
		System.out.println(VerifyName);
		if(VerifyName.contains("Anjali")) {
			System.out.println("Verify Name is displayed");
		}
		else {
			System.out.println("Verify Name is Not displayed");
			
		}
		driver.quit();
	}

}
