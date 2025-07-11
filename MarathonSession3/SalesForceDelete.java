package MarathonSession3;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SalesForceDelete extends SalesForceBase{
	

	@BeforeTest
	public void setFilePath() {
     filePath="DeleteAccount";
     sheetName="Deleteform";
	}
	 
	@Test(dataProvider = "fetchData")
	 public void RunSalesForcceEdit(String accountname) throws InterruptedException, AWTException {
	
        /*driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'])[5]")).click();
        Thread.sleep(1000);*/
        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()",accountsTab);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accountname);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
        Thread.sleep(2000);
        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s = noOfItems.split(" ");
        int countBeforeDelete = Integer.parseInt(s[0]);
        Thread.sleep(2000);
        /*driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(2000);*/
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Delete']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        Thread.sleep(2000);
        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        s = noOfItems.split(" ");
        int countAfterDelete = Integer.parseInt(s[0]);
        Thread.sleep(2000);
        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");

    }

}
