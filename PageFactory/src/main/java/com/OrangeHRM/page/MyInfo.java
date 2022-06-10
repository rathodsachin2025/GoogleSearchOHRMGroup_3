package com.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyInfo{
	
	public MyInfo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_pim_viewMyDetails")
	WebElement MYin;
	
	public WebElement MYinf() {
		return MYin ;

}
	
	@FindBy(id="btnSave")
	WebElement Edit;
	
	public WebElement edit1() {
		return Edit ;
	}
	
	@FindBy(name="personal[txtEmpFirstName]")
	WebElement firstName;
	
	public WebElement firstname() {
		return firstName ;
	}
	
	@FindBy(name = "personal[txtEmpFirstName]")
	WebElement fname;
	
	public void fname(String fn) {
		fname.sendKeys(fn);
		
	}
	
	@FindBy(id = "personal_txtEmpLastName")
	WebElement lastName;
	
	public WebElement lastName() {
		return lastName;
		
	}
	
	@FindBy(id = "personal_txtEmpLastName")
	WebElement lName;
	
	public void lName(String ln) {
		lName.sendKeys(ln);
	}
	
	@FindBy(id = "btnSave")
	WebElement savebtn;
	
	public WebElement savedtn() {
		return savebtn;
		
	}
	
//	@FindBy(id = "btnEditCustom")
//	WebElement editbtn;
//	
//	public WebElement editbtn() {
//		return editbtn;
//		
//	}
//	
//	@FindBy(name = "custom1")
//	WebElement blood;
//	
//	public void blood(String bl) {
//		Select s = new Select(blood);
//		
//	}
	
	@FindBy(name = "chkattdel[]")
	WebElement check;
	
	public WebElement check() {
		return check;
		
	}
	
	@FindBy(id = "btnDeleteAttachment")
	WebElement deletebtn;
	
	public WebElement deletebtn() {
		return deletebtn;
		
	}
}