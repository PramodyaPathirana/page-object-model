package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.qa.base.TestBase;

public class UsersPage extends TestBase  {

	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement actitimeLogo;
	
	@FindBy(xpath = "//*[@id=\"pageBody\"]/tbody/tr[1]/td[3]/div/div[3]/div[1]")
	WebElement components_button_label;
	
	@FindBy(xpath = "//*[@id=\"createUserPanel\"]")
	WebElement createUserPanel;
	
	public UsersPage() {
		PageFactory.initElements(driver, this);
	}
	
	@Test(priority = 1)
	public Boolean validateActiTimeLogo() {
		return actitimeLogo.isDisplayed();
	}
	
	@Test(priority = 2)
	public Boolean addUser() {
		components_button_label.click();
		if(createUserPanel.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}