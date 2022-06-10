package com.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {

	
	public LogOut(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "welcome")
	WebElement welcome;
	
	public WebElement welcome() {
		return welcome;
		
	}
	
	@FindBy(id = "//a[contains(text(),'Logout')]")
	WebElement logOut;
	
	public WebElement logOut() {
		return logOut;
		
	}
	
}
