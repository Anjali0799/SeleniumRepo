package week3.day2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		  ChromeDriver driver=new ChromeDriver();
		   //EdgeDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://www.amazon.in/");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		  Thread.sleep(1000);
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  Thread.sleep(2000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(6000);
		  
		  int intprice;
		  List<WebElement> priceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		  List<Integer> int1stPrice = new ArrayList<Integer>();
		  int Phones=int1stPrice.size();
		  System.out.println("No.of.Phones= "+ Phones);
		  Thread.sleep(1000);
		  
		  
		  for (WebElement priceElement : priceElements) {
	                String priceText = priceElement.getText().replace(",", "").trim();
	                int price = Integer.parseInt(priceText);
	                int1stPrice.add(price);
	            } 

	        // Sort prices and get the lowest one
	        Collections.sort(int1stPrice);
	        System.out.println("Lowest Phone price found an Amazon= " + int1stPrice.get(0));

	       

	        driver.quit();
		  
			
		  
	}

}
