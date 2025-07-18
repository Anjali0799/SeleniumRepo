package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.BeforeStep;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class baseclass extends AbstractTestNGCucumberTests {
	
	public static ChromeDriver driver;
	@BeforeMethod
	public void preConditions() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(4000);
		/*String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);*/
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(6000);
		
		
	}

	@AfterMethod
	public void postConditions(){
		driver.quit();
		
	}

}