package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

		
		public static WebDriver driver; 
		public static Properties prop; 
		
		
	
		public TestBase() throws IOException 
		{
			
		
			String filePath = System.getProperty("user.dir") + "/src/main/java/com/qa/config/config.properties";
			System.out.println(filePath);
			prop =new Properties();
			FileInputStream ip = new FileInputStream(filePath);
			prop.load(ip);
			
		}
		
		public static void intialization()
		{
			String browserName = prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
				WebDriverManager.chromedriver().setup(); 
				 driver = new ChromeDriver(); 
				
			}
			else if(browserName.equals("FF"))
			{
				WebDriverManager.firefoxdriver().setup(); 
				 driver = new FirefoxDriver(); 
				
			}
			else
			{
				System.out.println("no browser value is given");
			}
			
			
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(prop.getProperty("url"));
			}
		
		
		public void teardown()
		{
			driver.quit();
		}
		


	}

	
	
	
	
	

