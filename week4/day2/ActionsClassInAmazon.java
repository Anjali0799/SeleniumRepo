package week4.day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassInAmazon {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click()
		.sendKeys("oneplus 9 pro")
		.perform();
		Thread.sleep(1000);
	    Robot r=new Robot();
	    /*r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);*/
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		String SearchFirstProductPrice=driver.findElement(By.xpath("//span[@class='a-price']")).getText();
		System.out.println("First Product Price = " + SearchFirstProductPrice);
		Thread.sleep(2000);
		String SearchFirstProductReviews=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		 if(!SearchFirstProductReviews.contains("FirstProductReviews")) {
			System.out.println("First Product Reviews = " + SearchFirstProductReviews);
		}
		else {
			System.out.println("Search product Reviews is not Found");	
		}
		 Thread.sleep(3000);
		 Actions actions1=new Actions(driver);
	     actions1.moveToElement(driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"))).click().perform();
		 Thread.sleep(2000);
		 File src =driver.getScreenshotAs(OutputType.FILE);
		 File des = new File("./screenshot/snap.png");
	     FileUtils.copyFile(src, des);
	     Thread.sleep(3000);
	     Actions actions2=new Actions(driver);
	     actions2.moveToElement(driver.findElement(By.xpath("//input[@id='add-to-cart-button']"))).click().perform();
	     Thread.sleep(2000);
	     String Subtotal=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		 if(!Subtotal.contains("Subtotal")) {
			System.out.println("First Product CartSubtotal = " + Subtotal);
		}
		else {
			System.out.println("Search product Subtotal is not Found");	
		}
		 
		 driver.quit();
		 
	}

}
