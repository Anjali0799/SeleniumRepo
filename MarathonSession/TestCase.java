package MarathonSession;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.pvrcinemas.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'INOX Luxe Phoenix Market City, Velachery  (formerly Jazz Cinemas)Chennai')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
	    Thread.sleep(2000);
	     driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[4]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='06:35 PM']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@class='p-button p-component sc-gNZgCX hrwxnG bgColor filter-btn']")).click();
		 Thread.sleep(20000);
		 driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@id='EL.ELITE|A:22']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		 Thread.sleep(5000);
		 String Seatinfo=driver.findElement(By.xpath("//p[text()='A22']")).getText();
		 if(Seatinfo.equals("A22")) {
			System.out.println("Selected seat Number = " +Seatinfo );
		}
		else {
			System.out.println("Seat is Not Selected");
			
		}
		 Thread.sleep(1000);
		 String GrandTotal=driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']//span[contains(text(),'281.38')]")).getText();
		 if(GrandTotal.equals("281.38")) {
			System.out.println("Grand Total Price = " +GrandTotal );
		}
		else {
			System.out.println("Grand Total Price is Not Correct");
			
		}
		 driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		 Thread.sleep(5000); 
		 driver.findElement(By.xpath("(//i[@class ='pi pi-times'])[2]")).click();
		 Thread.sleep(5000);
		 String TitleName=driver.getTitle();
		 System.out.println(TitleName);
         Thread.sleep(2000);
         if (TitleName.contains("PVR Cinemas")) {
      	   System.out.println("Title of the page " + TitleName);
         }else {
      	   System.out.println("title is not matching the requirement");
			
		}
         
       driver.quit();
	    
	}

}
