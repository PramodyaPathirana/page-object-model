package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

public class ReportsPage extends TestBase  {

	
	// Web Element Xpath 
	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement actitimeLogo;
	
	@FindBy(xpath ="//*[@id=\"ext-comp-1017\"]/span")
	WebElement newReportBtn;
	
	@FindBy(xpath = "//*[@id=\"createReportLightBox\"]")
	WebElement createReportLightBox;
	
	// Call init
	public ReportsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	// Mathod
	public Boolean validateActiTimeLogo() {
		return actitimeLogo.isDisplayed();
	}

	public Boolean newReport() {
		newReportBtn.click();
		if(createReportLightBox.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
}