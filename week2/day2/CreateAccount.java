package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        
        driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
        
        driver.findElement(By.className("decorativeSubmit")).click();
        
        //driver.switchTo().alert().accept();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        //Thread.sleep(2000);
        
        //Thread.sleep(2000);
        driver.findElement(By.linkText("Accounts")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Create Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("accountName")).sendKeys("Anjali1"); //enter Account name 
        Thread.sleep(2000);
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); //enter description
        Thread.sleep(2000);
        driver.findElement(By.id("numberEmployees")).sendKeys("10"); //enter no.of.employess 
        Thread.sleep(2000);
        driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps"); //enter site name
        Thread.sleep(2000);
        driver.findElement(By.className("smallSubmit")).click(); //click create account button
        Thread.sleep(2000);
        
        String TitleName=driver.getTitle();
        System.out.println(TitleName);
        Thread.sleep(2000);
        if (TitleName.contains("Account Details")) {
     	   System.out.println("Title is verified");
        }else {
     	   System.out.println("title is not matching the requirement");
			
		}
        
      driver.close();

}
}
