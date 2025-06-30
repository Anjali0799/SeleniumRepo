package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WidowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
        driver.navigate().to("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String ParentWindowID=driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(1000);
		List<String> Windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Windows.get(1));
		System.out.println("child window title is: "+driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindowID);
		System.out.println("Parent window title is: "+driver.getTitle());
		driver.quit();
		
		
		
		
		
	
		
	}

}
