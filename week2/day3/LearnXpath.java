package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Anjali");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        Thread.sleep(1000);
	}

}
