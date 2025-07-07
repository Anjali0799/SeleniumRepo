package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SalesForceBase {

    static RemoteWebDriver driver;
	
	@Parameters({"url", "user", "pass", "search" , "browser"})
	@BeforeMethod
	public void precondition(String url, String username, String password,String search,String browser) throws InterruptedException {
		
       System.out.println("Test data's passed from the xml file is \n url : " + url +"\n user : " + username + "\n pass : " + password + "\n search : "+ search  +"\nBrowser enviroment is: " + browser);
		
		//Initialization is done here
		switch(browser.toLowerCase()) {
		case "Edge":
			driver = new EdgeDriver();
			break;
		default:
			ChromeOptions options  = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys(search);
		Thread.sleep(3000);
		
        driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[10]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();
		Thread.sleep(3000);
		}
	@AfterMethod
	public void postcondition() throws InterruptedException {
		
		driver.close();
		
	}

}
