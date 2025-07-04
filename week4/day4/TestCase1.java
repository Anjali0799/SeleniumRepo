package week4.day4;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends SalesForceProjectBase {

	@Test
	public void RunSalesForceTestCase1() throws InterruptedException {
		
		String Name="SalesForce Automation By Anjali";
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(Name);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
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
