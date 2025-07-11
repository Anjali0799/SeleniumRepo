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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalesForceEdit extends SalesForceBase{
	
	@BeforeTest
	public void setFilePath() {
     filePath="EditAccount";
     sheetName="Editform";
	}
	 
	@Test(dataProvider = "fetchData")
	 public void RunSalesForcceEdit(String accountname,String billingStreet,String shippingstreet, String phno) throws InterruptedException, AWTException {
	       
	        //driver.findElement(By.xpath("(//one-app-nav-bar-item-root[@class='navItem slds-context-bar__item slds-shrink-none'])[5]")).click();
	        //Thread.sleep(1000);
		    WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
            driver.executeScript("arguments[0].click()",accountsTab);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys(accountname);
            Thread.sleep(1000);
            WebElement  Clickfirtrowvalue=driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
            driver.executeScript("arguments[0].click()", Clickfirtrowvalue);
            Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@title='Edit']")).click();//a[@title='Edit']
	        Thread.sleep(2000);
	        WebElement typeDD = driver.findElement(By.xpath("//button[@aria-label='Type']"));
	        driver.executeScript("arguments[0].click()",typeDD);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Technology Partner']")).click();
	        WebElement industryDD = driver.findElement(By.xpath("//button[@aria-label='Industry']"));
	        driver.executeScript("arguments[0].click()",industryDD);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Healthcare']")).click();
	        WebElement biilingStreet = driver.findElement(By.xpath("//label[text()='Billing Street']/following::textarea"));
	        biilingStreet.clear();
	        biilingStreet.sendKeys(billingStreet);
	        WebElement shippingStreet = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
	        shippingStreet.clear();
	        shippingStreet.sendKeys(shippingstreet);
	        WebElement priorityDD = driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
	        driver.executeScript("arguments[0].click()",priorityDD);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Low']")).click();
	        driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Silver']")).click();
	        WebElement activeDD = driver.findElement(By.xpath("//button[@aria-label='Active']"));
	        driver.executeScript("arguments[0].click()",activeDD);
	        Thread.sleep(1000);
	        /*driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	        int randomNum1 = (int)(Math.random()*999999);
	        int randomNum2 = (int)(Math.random()*999999);
	        String phno = ""+randomNum1+randomNum2;
	        phno = phno.substring(0,10);
	        System.out.println(phno);*/
	        WebElement phnoField = driver.findElement(By.xpath("//input[@name='Phone']"));
	        phnoField.clear();
	        phnoField.sendKeys(phno);
	        WebElement upsellOpportunityDD = driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']"));
	        driver.executeScript("arguments[0].click()",upsellOpportunityDD);
	        driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='No']")).click();
	        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	        Thread.sleep(2000);
	        String phnoStr = driver.findElement(By.xpath("//td[@data-label='Phone']")).getText();
	        System.out.println(phnoStr);
	        Thread.sleep(2000);
	        Assert.assertTrue(phnoStr.contains(phno),"verify the mobileNumber");
	 }
	 
}