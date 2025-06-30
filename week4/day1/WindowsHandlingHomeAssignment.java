package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandlingHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    String ParentWindowID=driver.getWindowHandle();
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        Thread.sleep(2000);
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        Thread.sleep(2000);
        driver.findElement(By.className("decorativeSubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//span[text()='From Contact']/../following-sibling::td/a")).click();
        Thread.sleep(1000);
        List<String> Windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Windows.get(1));
		System.out.println("child window1 title is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
		driver.switchTo().window(Windows.get(0));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='To Contact']/../following-sibling::td/a")).click();
        Thread.sleep(2000);
		List<String> Windows1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Windows1.get(1));
		System.out.println("child window2 title is: "+driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[7]")).click();
		driver.switchTo().window(Windows.get(0));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		 String TitleName=driver.getTitle();
	        System.out.println(TitleName);
	        Thread.sleep(2000);
	        if (TitleName.contains("View Contact")) {
	     	   System.out.println("Title is verified");
	        }else {
	     	   System.out.println("title is not matching the requirement");
				
			}
		
		driver.quit();
		
	}

}
