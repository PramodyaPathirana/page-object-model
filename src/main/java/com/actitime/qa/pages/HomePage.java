package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.base.TestBase;

import net.bytebuddy.asm.Advice.Return;

public class HomePage extends TestBase {

	
	//Page Factory - Object Repository
	
		@FindBy(xpath = "//a[@class='content tasks']")
		WebElement taskLink;
		
		@FindBy(xpath = "//a[@class='content reports']")
		WebElement reportsLink;
		
		@FindBy(xpath = "//a[@class='content users']")
		WebElement usersLink;
		
		@FindBy(xpath = "//div[@id='logo_aT']")
		WebElement actitimeLogo;
		
		@FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[4]/a")
		WebElement approveTimeTrack;
		
		@FindBy(xpath = "//*[@id=\"approveTTTable\"]/tbody[2]/tr[1]/td[7]/input")
		WebElement approveDanielAll;
		
		
		
	
		
		//initialization
		
		public HomePage() {
			
			PageFactory.initElements(driver, this);
		}
		
		
		//Action/Methods
		
		public Boolean validateActiTimeLogo() {
			return actitimeLogo.isDisplayed();
		}
		
		//go to approveTimeTrack Page 
		public Boolean goToApproveTimeTrack() {
			approveTimeTrack.click();
			if(approveTimeTrack.isDisplayed()) {
				return true;
			}else {
				return false;
			}
		}
		
		//approve leave if not already approved
		public Boolean approveTimeTrack() {
			if (approveDanielAll.isSelected()) {
				return true;
			}else if(!approveDanielAll.isSelected()) {
				approveDanielAll.click();
				return true;
			}else {
				return false;
			}
		}
		
		public TasksPage clickOnTaskLink() {
			
			taskLink.click();
			return new TasksPage();
			
		}
		
		
        public ReportsPage clickOnReportsLink() {
			
	         reportsLink.click();
	         return new ReportsPage();
			
		}
        
        public UsersPage clickOnUsersLink() {
			
	         usersLink.click();
	         return new UsersPage();
			
		}
	
}
