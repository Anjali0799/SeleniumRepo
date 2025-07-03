package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.lang.model.util.Elements.Origin;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.semconv.SemanticAttributes.TypeValues;

public class ActionClassSnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
	    Actions ac = new Actions(driver);
	    ac.moveToElement(driver.findElement(By.xpath("(//span[@class='catText'])[1]"))).click().pause(2000).perform();
	    ac.click(driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"))).pause(2000).perform();
	    Thread.sleep(1000);
	    String SportsShoescount=driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	    if(!SportsShoescount.contains("SportsShoescount")) {
		   System.out.println("The SportsShoescount is =" + SportsShoescount);
	    }
	    else {
	    	System.out.println("The SportsShoescount is Not Found");
	}
	    ac.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    ac.moveToElement(driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    ac.moveToElement(driver.findElement(By.xpath("(//li[@class='search-li'])[1]"))).click().pause(2000).perform();
	    Thread.sleep(1000);
	    
	    List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='lfloat marR10']"));
	    List<Integer> priceValues = new ArrayList<>();
        Thread.sleep(3000);
        List<Integer> sortedPrices = new ArrayList<>(priceValues);
        Collections.sort(sortedPrices);

        if (priceValues.equals(sortedPrices)) {
            System.out.println("Items are sorted from Low to High.");
        } else {
            System.out.println("Items are NOT sorted correctly.");
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 600);");
        WebElement minPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='fromVal']")));
        WebElement maxPrice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='toVal']")));
        minPrice.clear();
        minPrice.sendKeys("500");
        maxPrice.clear();
        maxPrice.sendKeys("700");
        WebElement goButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")));
        goButton.click();
        Thread.sleep(2000);
        WebElement Colour=driver.findElement(By.xpath("//span[@class='filter-color-tile White&Blue ']"));
        Colour.click();
        Thread.sleep(2000);
        Thread.sleep(3000);
        List<WebElement> filters = driver.findElements(By.xpath("(//div[@class='filters'])[1]"));
        if(!filters.contains("filters")) {
              System.out.println("Applied Filters");
        }
        else {
        	System.out.println("Applied Filters Not Found");
        }
        ac.moveToElement(driver.findElement(By.xpath("(//p[@class='product-title'])[1]"))).perform();
        ac.click(driver.findElement(By.xpath("(//div[contains(text(),'Quick View')])[1]"))).perform();
        Thread.sleep(2000);
        String CostandPercentage=driver.findElement(By.xpath("//div[@class=' pdp-e-i-PAY clearfix']")).getText();
        if(!CostandPercentage.contains("CostandPercentage")) {
        	System.out.println("Cost and Discount Price= "+ CostandPercentage);
        }
        else {
        	System.out.println("Cost and Discount Price Not Found");
        }
        File src =driver.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshot/snap2.png");
        FileUtils.copyFile(src, des);
        Thread.sleep(2000);
        driver.quit();
        
      }
}
