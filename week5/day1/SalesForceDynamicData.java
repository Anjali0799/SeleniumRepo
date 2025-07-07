package week5.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceDynamicData extends SalesForceBase {
	
	@DataProvider(name="fetchData")
	public String[][] SendData() {
		
		String [][] dynamic;
	    dynamic =new String[1][3];
		dynamic[0][0]="SalesForce Automation By Anjali";
		dynamic[0][1]="TestLeaf";
		dynamic[0][2]="Learn Automation";
		return dynamic;
		
	}
	@Test(dataProvider="fetchData")
	public void RunSalesForceDynamicData(String cname, String fname, String lname) throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(cname);
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(fname);
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys(lname);
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


