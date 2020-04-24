package com.qa.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

		LoginPage loginPage;
		
		
 public LoginPageTest() throws IOException {
		
		super(); 
	 }
	 
		
		@BeforeClass
		
		public void setup() throws IOException {
			
			
			intialization(); 
			loginPage = new LoginPage();
			
		}
		
		@Test(priority=1)
		public void loginPageTitleTest()
		{
		String title =loginPage.validateLoginPageTitle(); 
		Assert.assertEquals(title, "Log in");
		}
		
		@Test(priority=2)
		public void drupalLogoImageTest()
		{
		 boolean flag = loginPage.validateDrupalLogo();
		 Assert.assertTrue(flag);
		}
		
		@Test(priority=3)
		public void loginTest()
		{
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
		
		@AfterClass
		public void closeBrowser()
		{
			teardown();
		}
		
		
		
		
		
		
		
		
		
	}
