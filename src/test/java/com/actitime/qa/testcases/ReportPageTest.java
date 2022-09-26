package com.actitime.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;
import com.actitime.qa.pages.HomePage;
import com.actitime.qa.pages.LoginPage;
import com.actitime.qa.pages.ReportsPage;

public class ReportPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	ReportsPage reportsPage;
	
	public ReportPageTest() {
		super();
		
	}
	
	@BeforeMethod
	public void seup() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
		homePage.clickOnReportsLink();
		reportsPage = new ReportsPage();
	}
	
	@Test(priority = 1)
	public void reportsPageLogoTest() {		
	boolean flag= reportsPage.validateActiTimeLogo();
	Assert.assertTrue(flag);

	}
	
	@Test(priority = 2)
	public void reportsPagenewReportTest() {		
	boolean flag= reportsPage.newReport();
	Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}