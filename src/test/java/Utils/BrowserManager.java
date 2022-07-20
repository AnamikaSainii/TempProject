package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class BrowserManager {
    public static WebDriver getDriver(String type, String url) {
    	WebDriver driver;
    		driver = new ChromeDriver();
    	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		Reporter.log("Nevigated to Browser:" + type + "URL: " + url,true);
		return driver;
		
    	
    }
}

