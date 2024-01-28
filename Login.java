package com.egapy.create.account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	@Parameters("browser")
	@BeforeClass
	
	public void log (@Optional ("chrome") String browser) {
		
		if (browser.equalsIgnoreCase("chrome")){
			
			driver =new ChromeDriver();
			}
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.egapy.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void logincred () {
		
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--18981293490464__ccfafd7a-7166-43fa-9673-9be28b294582\"]/sticky-header/div/div/div[3]/a[1]")).click();
		
		WebElement emailadd = driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
		
		emailadd.sendKeys("relxationnature@gmail.com");
		
		WebElement paswd = driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
		paswd.sendKeys("ashu0000");
		
		driver.findElement(By.xpath("//*[@value=\"Log in\"]")).click();
		
		
		
	}
	
	
	
	

}
