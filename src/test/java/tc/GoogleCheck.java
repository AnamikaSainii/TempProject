package tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import po.Po_SearchGoogle;

public class GoogleCheck {
	
		@Test
		public void t_01_google_search() {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anamika.saini\\Downloads\\litux3_regressiontests\\litux3_regressiontests\\target\\test-classes\\drivers\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver=new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//maximize window
		driver.manage().window().maximize();

		//open browser with desried URL
		driver.get("https://www.google.com");
	
		}
	
}