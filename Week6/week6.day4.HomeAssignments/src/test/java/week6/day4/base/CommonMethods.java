package week6.day4.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.internal.Utils;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class CommonMethods extends AbstractTestNGCucumberTests {
	
	private static ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	public String filePath, sheetName;

	@Parameters({ "url", "browser" })
	@BeforeMethod
	public void preCondition(String url, String browser) {
		// Initialization is done here
		switch (browser.toLowerCase()) {
		case "edge":
			setDriver(new EdgeDriver());
			break;
		case "firefox":
			setDriver(new FirefoxDriver());
			break;
		default:
			ChromeOptions options = new ChromeOptions();
			options.addArguments("guest");
			setDriver(new ChromeDriver(options));
			break;
		}
		System.out.println("Driver value" + getDriver());
		getDriver().manage().window().maximize();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {

		getDriver().quit();
	}

	// setter
	public void setDriver(RemoteWebDriver driver) {
		rd.set(driver);
	}

	// getter
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	@DataProvider(name = "fetchData")
	public String[][] sendData() throws IOException {
		return week6.day4.utils.TestDataLibrary.readData(filePath, sheetName);
	}
}



