package week4.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SalesForceProjectBase {

	static ChromeDriver driver;
	
	@BeforeMethod
	public void precondition() throws InterruptedException {
		
		ChromeOptions options  = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("bhuvanesh.moorthy@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@2025");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
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
		
		Thread.sleep(1000);
		driver.close();
		System.out.println("after method");
	}

}
