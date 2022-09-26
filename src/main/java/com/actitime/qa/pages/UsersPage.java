package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.actitime.qa.base.TestBase;

public class UsersPage extends TestBase  {

	@FindBy(xpath = "//div[@id='logo_aT']")
	WebElement actitimeLogo;
	
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/div/table/tbody/tr[1]/td[1]/div/table")
	WebElement userListTableContainer;
	
	@FindBy(xpath = "//*[@id=\"editUserPanel\"]/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div/table/tbody/tr/td[2]/div")
	WebElement timeTrack;
	
	
	
	public UsersPage() {
		PageFactory.initElements(driver, this);
	}

	
	@Test(priority = 1)
	public Boolean validateActiTimeLogo() {
		return actitimeLogo.isDisplayed();
	}
	
	//click on the first user
	@Test(priority = 2)
	public Boolean openUserProfile() {
		userListTableContainer.click();
		if(userListTableContainer.isDisplayed()) {
			return true;
		}else {
			return false;
		}
	}
}
	