package MarathonSession3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceCreate extends SalesForceBase {
	
	@BeforeTest
	public void setFilePath() {
     filePath="CreateAccount";
     sheetName="CreateForm";
	}
	 
	@Test(dataProvider = "fetchData")
	 public void RunSalesForceCreate(String accountname) throws InterruptedException, AWTException {
		
		    driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[5]")).click();
           // Thread.sleep(2000);
	        driver.findElement(By.xpath("(//one-app-nav-bar-menu-item[@class='slds-dropdown__item'])[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(accountname);
	        Thread.sleep(1000);
	        //WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
			//driver.executeScript("arguments[0].click()", ownershipDD);
			//driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Public']")).click();*/
			//Thread.sleep(1000);
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
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	        String VerifyName=driver.findElement(By.xpath("//div[contains(text(),'Anjali')]")).getText();
			System.out.println(VerifyName);
	        Assert.assertTrue(VerifyName.contains(accountname),"Verify the Account name");
	        
	        //driver.quit();
	    }


}
