package com.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
		WebDriver driver;
		
		@FindBy(id="welcome")
		WebElement homePageUserName;
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath = "//b[contains(text(),'Admin')]")
		WebElement admin;
		
		public WebElement admin() {
			return admin;
		}
		
		@FindBy(id = "menu_admin_UserManagement")
		WebElement userMang;
		
		public WebElement UserM() {
			return userMang;
			
		}
		
		@FindBy(id = "menu_admin_viewSystemUsers")
		WebElement user;
		
		public WebElement user() {
			return user;
			
		}
		
		@FindBy(id="searchSystemUser_userName")
		WebElement usn;
		
		public void uName(String un) {
		usn.sendKeys(un);	
		}
		
		@FindBy(id="searchBtn")
		WebElement sr;
		
		public WebElement sr() {
			return sr;
		}
		
		
		@FindBy(id = "resetBtn")
		WebElement rs;
		
		public WebElement rs() {
			return rs;
			
		}
		
		@FindBy(name = "btnAdd")
		WebElement ad;
		
		public WebElement ad() {
			return ad;
		}
		
		@FindBy(id = "systemUser_employeeName_empName")
		WebElement adUn;
		
		public void adUn(String adUnn) {
			adUn.sendKeys(adUnn);
			
		}
		
		@FindBy(id = "systemUser_userName")
		WebElement en;
		
		public void en(String adEn) {
			en.sendKeys(adEn);
		}
		@FindBy(id = "systemUser_password")
		WebElement pd;
		
		public void cpd(String pwd) {
			pd.sendKeys(pwd);
		}
		
		@FindBy(id = "systemUser_confirmPassword")
		WebElement cpd;
		
		public void pd(String cpwd) {
			cpd.sendKeys(cpwd);
		}
		
		@FindBy(id = "btnSave")
		WebElement sv;
		
		public WebElement sv() {
			return sv;
			
		}
		
		@FindBy(xpath  = "//tbody/tr[1]/td[2]/a[1]")
		WebElement cl;
		
		public WebElement cl() {
			return cl;
		}
		
		@FindBy(id= "btnSave")
		WebElement edit;
		
		public WebElement edit() {
			return edit;
		}
		
		@FindBy(id = "systemUser_employeeName_empName")
		WebElement cn;
		
		public WebElement cn() {
			return cn;	
		}
		
		@FindBy(id = "systemUser_employeeName_empName")
		WebElement rcn;
		
		public void rcn(String rcnn) {
			rcn.sendKeys(rcnn);	
		}
		
		@FindBy(id = "systemUser_userName")
		WebElement cun;
		
		public WebElement cun() {
			return cun;
			
		}
		
		@FindBy(id = "systemUser_userName")
		WebElement rcun;
		
		public void rcun(String rcunn) {
			rcun.sendKeys(rcunn);
		}
		
		@FindBy(id = "btnSave")
		WebElement svbtn;
		
		public WebElement svbtn() {
			return svbtn;
		}
		
		@FindBy(name = "chkSelectRow[]")
		WebElement clc;
		
		public WebElement clc() {
			return clc;
		}
		
		@FindBy(id = "btnDelete")
		WebElement dl;
		
		public WebElement dl() {
			return dl;
			
		}
		
		@FindBy(id = "dialogDeleteBtn")
		WebElement ok;
		
		public WebElement ok() {
			return ok;
			
		}
		public String getHomePageDashboardUserName() {
			return homePageUserName.getText();
		
		}


}