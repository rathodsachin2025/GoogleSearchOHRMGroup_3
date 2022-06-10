package com.OrangeHRM.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimEmp {
	
	
	public PimEmp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMbtn;
	
	public WebElement pim() {
		return PIMbtn;
	}
	
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement Emplylist;
	public WebElement Emoly() {
		return Emplylist;
	}
	
		@FindBy(id="empsearch_id")
		WebElement Emplyid;
		
		public void empid(String Empid) {
			Emplyid.sendKeys(Empid);
		}
		
		@FindBy(id="searchBtn")
		WebElement search ;
		public WebElement srchbtn() {
			return search;
		}
		@FindBy(id="btnAdd")
		WebElement Add ;
		public WebElement btnadd() {
			return Add;
		}
		@FindBy(id="firstName")
		WebElement firstName;
		public void firstName(String fn) {
			firstName.sendKeys(fn);
		}
		@FindBy(id="lastName")
		WebElement lastname ;
		public void lastName1(String ln) {
			lastname.sendKeys(ln);
		}
		@FindBy(id="btnSave")
		WebElement save ;
		public WebElement save() {
			return save;
		}
		
		@FindBy(id="menu_pim_viewEmployeeList")
		WebElement Empl;
		public WebElement Emo() {
			return Emplylist;
		}
		
		@FindBy(name="chkSelectRow[]")
		WebElement PIMbtn1;
		public WebElement pimbtn() {
			return PIMbtn1;
		}
		@FindBy(id="btnDelete")
		WebElement delete ;
		public WebElement deletebtn() {
			return delete;
		}
		@FindBy(id="dialogDeleteBtn")
		WebElement ok ;
		public WebElement okdlt() {
			return ok;

}
}