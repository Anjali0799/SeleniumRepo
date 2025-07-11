package MarathonSession3;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class SalesForceBase {

	public static RemoteWebDriver driver;
	public String filePath, sheetName;

	@Parameters({ "user", "pass", "url", "browser" }) 
	@BeforeMethod
	public void preCondition(String username, String password, String url, String browser)  throws InterruptedException, AWTException {
		System.out.println("Test data's passed from the xml file is \n url : " + url + "\n user is :" + username
				+ "\n pass is :" + password + "\n browser environment is :" + browser);
		switch (browser.toLowerCase()) {
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			break;
		}
		    driver.manage().window().maximize();
		    driver.get(url);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.findElement(By.id("username")).sendKeys(username);
	        driver.findElement(By.id("password")).sendKeys(password);
	        driver.findElement(By.id("Login")).click();
	        Thread.sleep(6000);
			driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='View All']")).click();
	        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
	        //Thread.sleep(2000);
	        //WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
	        //driver.executeScript("arguments[0].click()",accountsTab);
	        
		}
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		
		return TestLibraryData.readData(filePath, sheetName);
	}
	

}



