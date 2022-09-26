package com.actitime.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.ReportsPage;
import com.actitime.qa.pages.UsersPage;

public class UsersPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	UsersPage usersPage;
	
	public UsersPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
//		homePage.clickOnUsersLink();
		usersPage = new UsersPage();
	}
	
	@Test(priority = 1)
	public void usersPageLogoTest() {		
	boolean flag= usersPage.validateActiTimeLogo();
	Assert.assertTrue(flag,"Cannot find the Logo");
		
	}
	
	@Test(priority = 2)
	public void reportsPageNewReportTest() {		
	boolean flag= usersPage.addUser();
	Assert.assertTrue(flag);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}