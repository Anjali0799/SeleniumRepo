package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		  //ChromeDriver driver=new ChromeDriver();
		  EdgeDriver driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("http://leaftaps.com/opentaps/. .");
		  Thread.sleep(2000);
		  driver.navigate().to("http://leaftaps.com/opentaps/. .");
		  Thread.sleep(2000);
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  Thread.sleep(2000);
	      driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	      Thread.sleep(2000);  
	      driver.findElement(By.className("decorativeSubmit")).click();
	      Thread.sleep(2000); 
	      driver.findElement(By.partialLinkText("CRM/SFA")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.linkText("Leads")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.linkText("Create Lead")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf01");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi01");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ar");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("ArthiArun");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Selenium");
	      Thread.sleep(1000);
	      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arthi@gmail.com");
	      Thread.sleep(1000);
	      WebElement Stateprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select State = new Select(Stateprovince);
		  State.selectByValue("IN");
		  Thread.sleep(1000);
		  driver.findElement(By.name("submitButton")).click();//click create lead button
	      Thread.sleep(1000);
	      //start click edit button
	      driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.id("updateLeadForm_description")).clear();
	      Thread.sleep(1000);
	      driver.findElement(By.id("updateLeadForm_description")).sendKeys("We Learn Automation selenium using java");
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		  Thread.sleep(2000);
		  String TitleName=driver.getTitle();
	        System.out.println(TitleName);
	        if (TitleName.contains("View Lead")) {
	        	System.out.println("Title is verified");
	        }
	        else {
	        	System.out.println("Title is not veriifed");
}
         driver.quit();
	      
	}

}
