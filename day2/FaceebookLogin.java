package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FaceebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
           //ChromeDriver driver=new ChromeDriver();
		   EdgeDriver driver=new EdgeDriver();
           driver.manage().window().maximize();
           driver.get("https://www.facebook.com/");
           driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
           Thread.sleep(2000);
           driver.findElement(By.name("pass")).sendKeys("Tuna@321");
           Thread.sleep(2000);
           driver.findElement(By.name("login")).click();
           Thread.sleep(2000);
           
           driver.findElement(By.linkText("Find your account and log in.")).click();
           Thread.sleep(2000);
           String TitleName=driver.getTitle();
           System.out.println(TitleName);
           Thread.sleep(2000);
           if (TitleName.contains("Forgotten Password")) {
        	   System.out.println("Title is verified");
           }else {
        	   System.out.println("title is not matching the requirement");
			
		}
           
         driver.close();
       
	}
}
