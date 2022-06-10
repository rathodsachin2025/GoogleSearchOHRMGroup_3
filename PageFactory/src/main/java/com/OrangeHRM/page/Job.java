package com.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job {
	
	public Job(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement admin;

	public WebElement admin() {
	return admin;
	}

	@FindBy(id="menu_admin_Job")
	WebElement job;

	public WebElement job() {
	return job;

	}

	@FindBy(id="menu_admin_viewJobTitleList")
	WebElement jobTitles;

	public WebElement jobTitles() {
	return jobTitles;

	}

	@FindBy(id="btnAdd")
	WebElement add;

	public WebElement add() {
	return add;

	}
	
	@FindBy(id = "jobTitle_jobTitle")
	WebElement adJ;
	
	public void adJ(String adjb) {
		adJ.sendKeys(adjb);
	}
	
	@FindBy(id = "btnSave")
	WebElement ss;
	
	public WebElement ss() {
		return ss;
		
	}

//	@FindBy(id="btnCancel")
//	WebElement cancle;
//
//	public WebElement cancle() {
//	return cancle;
//
//	}

	@FindBy(name = "chkSelectRow[]")
	WebElement clickOnJobTitleCheckBox;

	public WebElement clickOnJobTitlCheckcBox() {
	return clickOnJobTitleCheckBox;

	}

	@FindBy(id="btnDelete")
	WebElement delete;

	public WebElement delete() {
	return delete;

	}
	
	@FindBy(id = "dialogDeleteBtn")
	WebElement dialogdt;
	
	public WebElement dialogdt() {
		return dialogdt;
		
	}

	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]/a")
	WebElement clickOnJobTitle;

	public WebElement clickOnJobTitle() {
	return clickOnJobTitle;

	}

	@FindBy(id="btnSave")
	WebElement edit;

	public WebElement edit() {
	return edit;

	}
	
	@FindBy(name = "jobTitle[jobTitle]")
	WebElement jobTitle;
	
	public WebElement jobTitle() {
		return jobTitle;
		
	}
	
	@FindBy(name = "jobTitle[jobTitle]")
	WebElement jobTitleEdit;
	
	public void jobTitleEdit(String jte) {
		jobTitleEdit.sendKeys(jte);
	}
	
	@FindBy(id = "btnSave")
	WebElement svb;
	
	public WebElement svb() {
		return svb;
		
	}
	

}
