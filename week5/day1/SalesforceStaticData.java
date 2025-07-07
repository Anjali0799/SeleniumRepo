package week5.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SalesforceStaticData extends SalesForceBase {

	@Test
	public void RunSalesForceTestCase1() throws InterruptedException, AWTException {
		
		String CompanyName="TestLeaf";
		String Description="Learn Automation Selenium";
		String Name="SalesForce Automation By Anjali";
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Name);
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(CompanyName);
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(Description);
		Thread.sleep(1000);
		Robot r=new Robot();
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
	 
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String VerifyName=driver.findElement(By.xpath("//div[contains(text(),'Anjali')]")).getText();
		System.out.println(VerifyName);
		if(VerifyName.contains("Anjali")) {
			System.out.println("Verify Name is displayed");
		}
		else {
			System.out.println("Verify Name is Not displayed");
			
		}

	}

}
