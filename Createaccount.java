package com.egapy.create.account;

import java.time.Duration;

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

public class Createaccount {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	
	@Parameters ("browser")
	@BeforeClass
	
	public void create (@Optional("chrome")  String browser  ) {
		
		if (browser.equalsIgnoreCase("chrome")) {
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
		//driver.manage().window().fullscreen();

		
		
	}
	
	@Test
	public void craeteacct () {
wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--18981293490464__ccfafd7a-7166-43fa-9673-9be28b294582\"]/sticky-header/div/div/div[3]/a[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"halo-auth-sidebar\"]/div[2]/form/div[3]/a[2]")).click();
	
	WebElement firstname = driver.findElement(By.name("customer[first_name]"));
	
	firstname.sendKeys("relax");
	
	WebElement  lastname = driver.findElement(By.name("customer[last_name]"));
	
	lastname.sendKeys("nature");
	
WebElement  emaild = driver.findElement(By.name("customer[email]"));
	
    emaild.sendKeys("relxationnature@gmail.com");
	
WebElement  pswd = driver.findElement(By.name("customer[password]"));
	
     pswd.sendKeys("ashu0000");
     
	driver.findElement(By.xpath("//*[@id=\"create_customer\"]/div[6]/input")).click();
	
	
		
		
		
		
		
	}
	
	

}
