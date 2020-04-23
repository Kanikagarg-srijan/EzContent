package com.qa.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {
public static WebDriver driver;
	
	public static void implicit(int Time) {
		
		driver.manage().timeouts().implicitlyWait(Time, TimeUnit.SECONDS);
		
	}
	
	public static void explicit_visible(WebDriver driver, WebElement element, int timeout, String value)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		
	}
		
	
	public static void explicit_clickable(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
		
	
}

