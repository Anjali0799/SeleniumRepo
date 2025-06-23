package MarathonSession;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCases2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot r= new Robot();
		//EdgeDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
	    Thread.sleep(1000);
	    r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
	    //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    //Thread.sleep(5000);
	    String SearchResult=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none s-breadcrumb-with-all-filters sf-breadcrumb-all-filters-button-container']")).getText();
		 if(SearchResult.contains("results")) {
			System.out.println("Search Result = " + SearchResult);
		}
		else {
			System.out.println("Search Result is not Found");	
		}
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[5]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		 Thread.sleep(4000);
		 String FirstProduct=driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']")).getText();
		 System.out.println("First Product = " + FirstProduct);
		 //Thread.sleep(2000);
	        /*if (FirstProduct.contains("Product Name")) {
	     	   System.out.println("ProductName is Showing correctly");
	        }else {
	     	   System.out.println("ProductName is Not Showing correctly");
				
			}*/
		 Thread.sleep(3000);
		 String FirstProductPrice=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		 System.out.println("FirstProductPrice = " + FirstProductPrice);
		 Thread.sleep(3000);
		 String Title=driver.getTitle();
		 System.out.println("Title of the page is:" + Title);
		 driver.close();
}
	 
}

