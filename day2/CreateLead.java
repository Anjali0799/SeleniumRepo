package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		        //ChromeDriver driver=new ChromeDriver();
				EdgeDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
		        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		        Thread.sleep(1000);
		        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		        Thread.sleep(1000);
		        driver.findElement(By.className("decorativeSubmit")).click();
		        Thread.sleep(1000);
		        
		        driver.findElement(By.partialLinkText("CRM/SFA")).click();
		        Thread.sleep(1000);
		        
		        driver.findElement(By.linkText("Leads")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.linkText("Create Lead")).click();
		        Thread.sleep(1000);
		        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arthi");//Enter the first name.
		        Thread.sleep(1000);
		        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");//Enter the Last Name
		        Thread.sleep(1000);
		        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");//Enter the Company Name
		        Thread.sleep(1000);
		        driver.findElement(By.name("generalProfTitle")).sendKeys("Automation");//Enter the Title
		        Thread.sleep(1000);
		        driver.findElement(By.name("submitButton")).click();//click create lead button
		        Thread.sleep(1000);
		        String TitleName=driver.getTitle();
		        System.out.println(TitleName);
		        if (TitleName.contains("View Lead")) {
		        	System.out.println("Title is verified");
		        }
		        else {
		        	System.out.println("Title is not veriifed");
	}
	driver.close();
		        
		        
	}

}
