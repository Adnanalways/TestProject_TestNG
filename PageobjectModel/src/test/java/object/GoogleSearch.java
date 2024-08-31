package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver driver;
	
	
	@BeforeClass
	
	
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
	    driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void testgooglesearch() {
	WebElement searchBox =driver.findElement(By.name("q"));
	
	searchBox.sendKeys("selenium webDriver");
	
	searchBox.submit();
	
	driver.findElement(By.id("search"));
	
	Assert.assertTrue(driver.getTitle().contains("Selenium webDriver"));
	}
	
	@AfterClass
	public void teardown() {
		if(driver !=null) {
			driver.quit();
		}
		
	}

}
