package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookReg {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Arthi");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("M");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("rohitanjali07@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
        Thread.sleep(1000);
        
        WebElement DateDropdown = driver.findElement(By.id("day"));//createLeadForm_dataSourceId
		Select Date = new Select(DateDropdown);//createLeadForm_marketingCampaignId
		Date.selectByVisibleText("19");
		Thread.sleep(1000);
		
		WebElement MonthDropdown = driver.findElement(By.id("month"));//createLeadForm_dataSourceId
		Select Month = new Select(MonthDropdown);//createLeadForm_marketingCampaignId
		Month.selectByVisibleText("Jul");
		Thread.sleep(1000);
		
		WebElement YearDropdown = driver.findElement(By.id("year"));
		Select Year = new Select(YearDropdown);//createLeadForm_marketingCampaignId
		Year.selectByVisibleText("1997");
		Thread.sleep(1000);
		
		WebElement Radiobutton = driver.findElement(By.id("sex"));
		Radiobutton.click();
		
		driver.close();
		
	}

}
