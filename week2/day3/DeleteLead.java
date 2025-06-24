package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		   //ChromeDriver driver=new ChromeDriver();
		   EdgeDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("http://leaftaps.com/opentaps/. .");
		  Thread.sleep(2000);
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  Thread.sleep(2000);
	      driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	      Thread.sleep(2000);  
	      driver.findElement(By.className("decorativeSubmit")).click();
	      Thread.sleep(2000);  
	      driver.findElement(By.partialLinkText("CRM/SFA")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.linkText("Leads")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.linkText("Find Leads")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("997");
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//table[@id='ext-gen242']")).click();
	      Thread.sleep(2000);
	      String LeadID=driver.findElement(By.xpath("//a[contains(text(),'13301')]")).getText();
			 if(LeadID.equals("13301")) {
				System.out.println("LeadID Number is = " +LeadID );
			}
			else {
				System.out.println("LeadID Not Found");
				
			}
	       Thread.sleep(1000);
		   driver.findElement(By.xpath("//a[contains(text(),'13301')]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@name='id']")).sendKeys("13301");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		   Thread.sleep(1000);
		   String Title=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
	       // System.out.println(Title);
	        Thread.sleep(2000);
	        if (Title.equals("No records to display")) {
	        	System.out.println("No records to display");
			}
			else {
				System.out.println("Records is display");
				
			}
		
		   driver.close();
		   
	      
	       
	}

}
