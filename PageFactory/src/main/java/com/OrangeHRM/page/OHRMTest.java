package com.OrangeHRM.page;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

public class OHRMTest {
	String driverPath = "C:\\Users\\RASACHIN\\Desktop\\Selenium\\SeleniumJares\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	LoginPage objLogin;
	HomePage objHomePage;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);	
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\RASACHIN\\Desktop\\rr.csv"));
		List<String[]> li=reader.readAll();
		  System.out.println("Total rows that we have is "+li.size());
		  
		// create Iterator reference
		  Iterator<String[]>i1= li.iterator();
		    
		 // Iterate all values 
		  
		 while(i1.hasNext()){
			 String[] str=i1.next();
			 objLogin.setUserName(str[0]);
			 objLogin.setPassword(str[1]);
			 objLogin.clickLogin();
			 Thread.sleep(3000);
		
		
		//objLogin.loginToOHRM("Admin","admin123");
		objHomePage = new HomePage(driver);
		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().matches("^Welcome [A-Z|a-z]+"));
		
//SACHIN		
		 WebElement adminBtn = objHomePage.admin();
		 adminBtn.click();
		 
		WebElement userBtn=objHomePage.UserM();
		userBtn.click();
		
		Thread.sleep(2000);
		
		WebElement userB=objHomePage.user();
		userB.click();
		Thread.sleep(2000);
		
		objHomePage.uName(str[2]);
		Thread.sleep(2000);
		
		WebElement src = objHomePage.sr();
		src.click();
		Thread.sleep(2000);
		
		WebElement rsb = objHomePage.rs();
		rsb.click();
		Thread.sleep(3000);
		
		WebElement adb = objHomePage.ad();
		adb.click();
		Thread.sleep(3000);
		
		objHomePage.adUn(str[3]);
		Thread.sleep(3000);
		
		objHomePage.en(str[4]);
		Thread.sleep(3000);
		
		objHomePage.pd(str[5]);
		Thread.sleep(3000);
		
		objHomePage.cpd(str[6]);
		Thread.sleep(3000);
		
		WebElement svB = objHomePage.sv();
		svB.click();
		Thread.sleep(3000);
			
		
		WebElement clc = objHomePage.cl();
		clc.click();
		Thread.sleep(2000);
		
		WebElement ed = objHomePage.edit();
		ed.click();
		Thread.sleep(3000);
		
		WebElement cnn = objHomePage.cn();
		cnn.clear();
		Thread.sleep(3000);
		
		objHomePage.rcn(str[7]);
		Thread.sleep(3000);
		
		WebElement cunn = objHomePage.cun();
		cunn.clear();
		Thread.sleep(3000);
		
		objHomePage.rcun(str[8]);
		Thread.sleep(3000);
		
		WebElement svb = objHomePage.svbtn();
		svb.click();
		Thread.sleep(3000);
		
		
		WebElement clcb = objHomePage.clc();
		clcb.click();
		Thread.sleep(3000);
		
		WebElement dlb = objHomePage.dl();
		dlb.click();
		Thread.sleep(3000);
		
		WebElement okd = objHomePage.ok();
		okd.click();
		Thread.sleep(3000);

//DARSHAN
		PimEmp pimEmp = new PimEmp(driver);
		
		WebElement pimB=pimEmp.pim();
		pimB.click();
		Thread.sleep(3000);
		
		WebElement empl = pimEmp.Emoly();
		empl.click();
		Thread.sleep(3000);
		
		pimEmp.empid(str[9]);
		Thread.sleep(3000);
		
		WebElement sr = pimEmp.srchbtn();
		sr.click();
		Thread.sleep(3000);
		
		WebElement ad = pimEmp.btnadd();
		ad.click();
		Thread.sleep(3000);
		
		pimEmp.firstName(str[10]);
		Thread.sleep(3000);
		
		pimEmp.lastName1(str[11]);
		Thread.sleep(3000);
		
		WebElement svv = pimEmp.save();
		svv.click();
		Thread.sleep(3000);
		
		WebElement em = pimEmp.Emo();
		em.click();
		Thread.sleep(3000);
		
		WebElement ck = pimEmp.pimbtn();
		ck.click();
		Thread.sleep(3000);
		
		WebElement dl = pimEmp.deletebtn();
		dl.click();
		Thread.sleep(3000);
		
		WebElement ook = pimEmp.okdlt();
		ook.click();
		Thread.sleep(3000);

//Lipika
		
		Job job = new Job(driver);
		
		WebElement adm = job.admin();
		adm.click();
		Thread.sleep(3000);
		
		WebElement jb = job.job();
		jb.click();
		Thread.sleep(3000);
		
		WebElement jl = job.jobTitles();
		jl.click();
		Thread.sleep(3000);
		
		WebElement ad1 = job.add();
		ad1.click();
		Thread.sleep(3000);
		
		job.adJ(str[12]);
		Thread.sleep(3000);
		
		WebElement ssv = job.ss();
		ssv.click();
		Thread.sleep(3000);
		
		WebElement ckj = job.clickOnJobTitlCheckcBox();
		ckj.click();
		Thread.sleep(3000);
		
		WebElement dl2 = job.delete();
		dl2.click();
		Thread.sleep(3000);
		
		WebElement dd = job.dialogdt();
		dd.click();
		Thread.sleep(3000);
		
		WebElement cj = job.clickOnJobTitle();
		cj.click();
		Thread.sleep(3000);
		
		WebElement edd = job.edit();
		edd.click();
		Thread.sleep(3000);
		
		WebElement jt = job.jobTitle();
		jt.clear();
		Thread.sleep(3000);
		
		job.jobTitleEdit(str[13]);
		Thread.sleep(3000);
		
		WebElement svvb = job.svb();
		svvb.click();
		Thread.sleep(3000);





//Ranganath
		
		
		MyInfo myInfo = new MyInfo(driver);
		
		WebElement myI = myInfo.MYinf();
		myI.click();
		Thread.sleep(3000);
		
		WebElement ed1 = myInfo.edit1();
		ed1.click();
		Thread.sleep(3000);
		
		WebElement fn1 = myInfo.firstname();
		fn1.clear();
		Thread.sleep(3000);
		
		myInfo.fname(str[14]);
		Thread.sleep(3000);
		
		WebElement ln1 = myInfo.lastName();	
		ln1.clear();
		Thread.sleep(3000);
		
		myInfo.lName(str[15]);
		Thread.sleep(3000);
		
		WebElement sv1 = myInfo.savedtn();
		sv1.click();
		Thread.sleep(3000);
		
		WebElement ck1 = myInfo.check();
		ck1.click();
		Thread.sleep(3000);
		
		WebElement dlt1 = myInfo.deletebtn();
		dlt1.click();
		Thread.sleep(3000);
		
		LogOut logOut = new LogOut(driver);
		
		WebElement wlc = logOut.welcome();
		wlc.click();
		Thread.sleep(3000);
		
		WebElement lgo = logOut.logOut();
		lgo.click();
		Thread.sleep(3000);
		
		System.out.println("Log Out Successful...!");

		
		driver.close();
	}
	
}
}