package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class ActionsClassInBigbasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.bigbasket.com/");
		String ParentWindowID=driver.getWindowHandle();
		Thread.sleep(2000);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Shop by')])[2]"))).click().pause(2000).perform();
	    ac.moveToElement(driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"))).pause(2000).perform();
	    ac.moveToElement(driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"))).pause(2000).perform();
	    ac.click(driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"))).perform();
	    Thread.sleep(2000);
	    WebElement BrandsCheckbox=driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
	    BrandsCheckbox.click();
	    Thread.sleep(3000);
		String text=driver.findElement(By.xpath("(//span[text()='bb Royal'])[1]")).getText();
		if (!text.contains("text")) {
			System.out.println(" The Brand CheckBox is =" + text);
	    }
	    else {
	    	System.out.println(" The Selected Product Price is Not Found");
	    }
		
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled Rice')]"))).click().perform();
	    Thread.sleep(3000);
	    List<String> Windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Windows.get(1));
		System.out.println("child window1 title is: "+driver.getTitle());
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		driver.findElement(By.xpath("//span[text()='5 kg']")).click();
		Thread.sleep(3000);
	    String CheckPrice=driver.findElement(By.xpath("//td[text()='₹329']")).getText();
	    if (!CheckPrice.contains("CheckPrice")) {
		      System.out.println(" The Selected Product Price is =" + CheckPrice);
	    }
	    else {
	    	System.out.println(" The Selected Product Price is Not Found");
	    }
		Actions actions2 = new Actions(driver);
	    actions2.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]"))).click().perform();
	    Thread.sleep(1000);
	    String SuccessMessage=driver.findElement(By.xpath("//p[contains(text(),'An item has been added to your basket successfully')]")).getText();
		if (!SuccessMessage.contains("Message")) {
			System.out.println(" The SuccessMessage is =" + SuccessMessage);
	    }
	    else {
	    	System.out.println("Success Message is Not found");
	    }
		Thread.sleep(1000);
		File src =driver.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshot/snap.png");
        FileUtils.copyFile(src, des);
        Thread.sleep(2000);
        driver.close();
        Thread.sleep(2000);
        driver.quit();
		
	    
	    
	    
	      
	      
		
		

	}

}
