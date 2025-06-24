package week2.day3;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.script.Message;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import week2.day1.FindMissingElement;

public class CheckboxXpath {

	public static void main(String[] args) throws InterruptedException {
	
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.navigate().to("https://leafground.com/checkbox.xhtml");
		  
		 WebElement basicCheckBox = driver.findElement(By.xpath("//span[text()='Basic']"));
			boolean displayed = basicCheckBox.isDisplayed();
			System.out.println(displayed);
			// true
			if (displayed) {
				basicCheckBox.click();
				WebElement verifyBasiccheckbox = driver.findElement(By.xpath("//span[text()='Basic']/preceding-sibling::div/input"));
				System.out.println(" the state of the basic CheckBox is "+verifyBasiccheckbox.isSelected());
			}
			
			WebElement Notificationcheckbox = driver.findElement(By.xpath("//span[text()='Ajax']"));
			boolean displayed1 = Notificationcheckbox.isDisplayed();
			System.out.println(displayed);
			// true
			if (displayed) {
				Notificationcheckbox.click();
				WebElement verifyNotification = driver.findElement(By.xpath("//span[text()='Ajax']/preceding-sibling::div/input"));
				System.out.println(" the Notification of the basic CheckBox1 is "+verifyNotification.isSelected());
			}
			
			WebElement LanguageCheckBox = driver.findElement(By.xpath("//label[text()='Java']"));
			boolean displayed2 = LanguageCheckBox.isDisplayed();
			LanguageCheckBox.click();
			//System.out.println(displayed);
			
			WebElement TristateCheckbox = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
			boolean isChecked = TristateCheckbox.isDisplayed();
			TristateCheckbox.click();
			System.out.println(displayed);
				// true
			if (isChecked) {
	            System.out.println("Tri-State Checkbox is in CHECKED state.");
	        } else {
	            System.out.println("Tri-State Checkbox is in UNCHECKED state.");
	        }
			
		    WebElement toggleswitch=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']"));
		    boolean isDisplayed = toggleswitch.isDisplayed();
		    toggleswitch.click();
		    System.out.println(displayed);
			// true
			if (isDisplayed) {
	            System.out.println("ToogleSwitch is ON.");
	        } else {
	            System.out.println("ToogleSwitch is Not ON.");
	        }
			WebElement disableCheckbox=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
			System.out.println(displayed);
			// true
			if (!disableCheckbox.isEnabled()) {
	            System.out.println("Verify if checkbox is Enabled.");
	        } else {
	            System.out.println("Verify if checkbox is disabled..");
	        }
			Thread.sleep(2000);
			driver.findElement(By.xpath("//ul[@class='ui-selectcheckboxmenu-multiple-container ui-widget ui-inputfield ui-state-default ui-corner-all']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Miami");
		    Thread.sleep(2000);
		    WebElement CheckboxMultiple=driver.findElement(By.xpath("(//label[contains(text(),'Miami')])[2]"));
			boolean isDisplayed1 = CheckboxMultiple.isDisplayed();
			CheckboxMultiple.click();
			System.out.println(displayed);
			// true
			if (isDisplayed1) {
	            System.out.println("Verify if checkbox is Checked.");
	        } else {
	            System.out.println("Verify if checkbox is Not Checked.");
	        }
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all ui-state-filled']")).clear();
			Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("Rome");
		    Thread.sleep(2000);
			WebElement CheckboxMultiple1=driver.findElement(By.xpath("(//label[contains(text(),'Rome')])[2]"));
			boolean isDisplayed2 = CheckboxMultiple1.isDisplayed();
			CheckboxMultiple1.click();
			System.out.println(displayed);
			// true
			if (isDisplayed2) {
	            System.out.println("Verify if checkbox is Checked1.");
	        } else {
	            System.out.println("Verify if checkbox is Not Checked1.");
	        }
			/*confirmation = wait.until(EC.presence_of_element_located((By.ID, "confirmation-panel")))
					assert "confirmed" in confirmation.text.lower()*/

			driver.quit();
		    
		}
	}