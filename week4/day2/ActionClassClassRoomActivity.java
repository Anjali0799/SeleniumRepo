package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.lang.model.element.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;



public class ActionClassClassRoomActivity {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(3000);
		Actions actions=new Actions(driver);
		actions.scrollToElement(driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"))).perform();
	    String text=driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']")).getText();
	    if(text.contains("Condition")) {
	    	System.out.println("Text is = " + text);
	    	}
	    else {
	    	System.out.println("Text is Not Found");
	    }
	    
	    File src =driver.getScreenshotAs(OutputType.FILE);
	    File des = new File("./screenshot/snap.png");
        FileUtils.copyFile(src, des);
		
		driver.quit();
	    }

}
