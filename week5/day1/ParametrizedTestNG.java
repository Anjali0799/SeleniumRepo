package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ParametrizedTestNG {
	
	static RemoteWebDriver driver;
	
	@Parameters({"url", "user", "pass", "browser"})
	@BeforeMethod
	public void precondition(String url, String username, String password,String browser) throws InterruptedException {
		
		System.out.println("Test data's passed from the xml file is \n url : " + url +" \n user : " + username + " \n pass : " + password + "\n Browser enviroment is: " + browser);
		
		//Initialization is done here
		switch(browser.toLowerCase()) {
		case "Edge":
			driver = new EdgeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default:
			ChromeOptions options  = new ChromeOptions();
			options.addArguments("guest");
			driver = new ChromeDriver(options);
			break;
		}
	    driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		
		
	}
	
    @AfterMethod
    public void postCondition() {
    	
    	driver.quit();
    	
    }
}


