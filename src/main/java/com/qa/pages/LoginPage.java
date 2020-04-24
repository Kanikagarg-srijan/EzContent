package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.waits.WaitStatements;

public class LoginPage extends TestBase {


		@FindBy(xpath="//input[@id='edit-name']")
		WebElement username;
		
		
		@FindBy(name="pass")
		WebElement password;
		
		
		@FindBy(xpath="//input[@id='edit-submit']")
		WebElement loginBtn;
		
		
		@FindBy(xpath="//img[@src='https://ezcontent.srijan.net/modules/contrib/gin_login/images/drupal.svg']")
		WebElement drupallogo;
		
		@FindBy(xpath="//h1[@class='page-title user-form-page__page-title']")
		WebElement loginLabel;
		
		
		public LoginPage() throws IOException 
		{
			
			PageFactory.initElements(driver, this); 
		}
		
		
		public String validateLoginPageTitle()
		{
			
			
			
			return loginLabel.getText();
		}
		
	
		public boolean validateDrupalLogo()
		{
			return drupallogo.isDisplayed();
		}
		
		
		public void login(String us, String pwd)
		
		{
			username.sendKeys(us);
			password.sendKeys(pwd);
		    WaitStatements.explicit_clickable(driver, loginBtn, 10);
			loginBtn.click();
			
		}
		
		
		
	}

	

