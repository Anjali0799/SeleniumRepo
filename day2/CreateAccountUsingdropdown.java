package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountUsingdropdown {

	public static void main(String[] args) throws InterruptedException {
		
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
		       driver.findElement(By.id("accountName")).sendKeys("Anjali2"); //enter Account name 
		        Thread.sleep(2000);
		        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester"); //enter description
		        Thread.sleep(2000);
		        
		        WebElement IndustryDropdown = driver.findElement(By.name("industryEnumId"));//createLeadForm_dataSourceId
				Select Industry = new Select(IndustryDropdown);//createLeadForm_marketingCampaignId
				Industry.selectByIndex(3);
				Thread.sleep(1000);
				
				WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));//createLeadForm_dataSourceId
				Select ownership = new Select(ownershipDropdown);//createLeadForm_marketingCampaignId
				ownership.selectByVisibleText("S-Corporation");
				Thread.sleep(1000);
				
				WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
				Select source = new Select(sourceDropdown);//createLeadForm_marketingCampaignId
				source.selectByValue("LEAD_EMPLOYEE");
				Thread.sleep(1000);
				
				WebElement MarketingCampaignDropdown = driver.findElement(By.name("marketingCampaignId"));//createLeadForm_dataSourceId
				Select MarketingCampaign = new Select(MarketingCampaignDropdown);//createLeadForm_marketingCampaignId
				MarketingCampaign.selectByIndex(6);
				Thread.sleep(1000);
				
				WebElement stateprovinceDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
				Select stateprovince = new Select(stateprovinceDropdown);//createLeadForm_marketingCampaignId
				stateprovince.selectByValue("TX");
				Thread.sleep(1000);
				
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
