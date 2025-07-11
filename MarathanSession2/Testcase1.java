package MarathanSession2;

import java.awt.Window;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        Shadow sh=new Shadow(driver);
        driver.manage().window().maximize();
        sh.setImplicitWait(20);
        
        driver.navigate().to("https://dev217936.service-now.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("ulJ8fB5Cd!/M");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
	    Thread.sleep(1000);
	    
		sh.findElementByXPath("//div[@id='d6e462a5c3533010cbd77096e940dd8c']").click();
	    Thread.sleep(1000);
	    sh.findElementByXPath("//span[contains(text(),'Service Catalog')]").click();
	    Thread.sleep(1000);
	    WebElement sss = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(sss);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()='Yes']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("99");
	    Thread.sleep(1000);
	    WebElement MonthlyallowanceDropdown = driver.findElement(By.name("IO:ff1f478e9747011021983d1e6253af68"));
		Select ownership = new Select(MonthlyallowanceDropdown);
		ownership.selectByVisibleText("Unlimited [add $4.00]");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
	    Thread.sleep(4000);
	    
	    String orderplacedmessage=driver.findElement(By.xpath("//span[contains(text(),'Thank you, your request has been submitted')]")).getText();
	    if (!orderplacedmessage.contains("Order")) {
	        System.out.println("Sucess Message = " + orderplacedmessage);
	    }
	    else {
	    	System.out.println("Success Message is Not found");
	    }
	    
	    String ReferenceNumber=driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
	    if (!ReferenceNumber.contains("ReferenceNumber")) {
	    	 System.out.println("ReferenceNumber = " + ReferenceNumber);
	 	    
	    }
	    else {
	    	System.out.println("Reference Number is Not found");
	    }
	    
	    driver.quit();
	    
		
	    
	    
	    
	    
	    
		

	}

	

}