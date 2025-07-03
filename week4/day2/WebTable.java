package week4.day2;

import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.formula.functions.Columns;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		
		Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("//span[text()='Markets']"))).pause(2000).perform();
	    ac.click(driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"))).perform();
		Thread.sleep(2000);
		List<WebElement> Rows= driver.findElements(By.xpath("//div/table/tbody/tr/td[2]/div"));
		System.out.println(Rows.size());
		for (WebElement row : Rows) {
			String cryptoName = row.getText();
			System.out.println(cryptoName);
		}
		 driver.quit();
	      
	}


		
		

	

}
