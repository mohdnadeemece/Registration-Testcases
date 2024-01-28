package com.egapy.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	@Parameters("browser")
	@BeforeClass

	public void loading (@Optional("chrome") String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		
//		driver.get("https://www.egapy.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--18981293490464__"
//				+ "ccfafd7a-7166-43fa-9673-9be28b294582\"]/sticky-header/div/div/div[3]/a[1]")).click();
		
	}
	
	
	@Test(dataProvider = "getData")
	public void loginpage (String Emailaddress, String pass) {
		
		driver.get("https://www.egapy.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--18981293490464__"
				+ "ccfafd7a-7166-43fa-9673-9be28b294582\"]/sticky-header/div/div/div[3]/a[1]")).click();

		
		WebElement emailadd = driver.findElement(By.xpath("//*[@id=\"customer_email\"]"));
		
		emailadd.sendKeys(Emailaddress);
		
		WebElement paswd = driver.findElement(By.xpath("//*[@id=\"customer_password\"]"));
		paswd.sendKeys( pass);
		
		driver.findElement(By.xpath("//*[@value=\"Log in\"]")).click();
		
		
		
	}
	
	@DataProvider
	@Test
	Object[][] getData()

	{
		 
		Object[][] data = new Object[4][2]; 
		
		// valid user-name valid password
		data[0][0] = "relxationnature@gmail.com";
		data[0][1] = "ashu0000"; 
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// valid user-name and invalid password 
		data[1][0] = "relxationnature@gmail.com";
		data[1][1] = "hgsuyhgf"; 
		
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// invalid user-name and valid password 
		data[2][0] = "shanmohd954@gmail.com";
		data[2][1] = "ashu0000"; 
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// invalid user-name and valid password 
		data[3][0] = "shanmohd954@gmail.com";
		data[3][1] = "jhdfuyfguy"; 
		
		return data;
		 
	} 
	

}


  
  









