package com.fpl.accountlogin;

import org.testng.annotations.Test;

import pageclasses.FPLPayBillPageFactory;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestLoginFPL {
	WebDriver driver;
	String baseUrl;
	FPLPayBillPageFactory fplMainPage;
	


	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		baseUrl = "https://www.fpl.com";
		fplMainPage = new FPLPayBillPageFactory(driver);

		// maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
	@Test
	public void testLogin() throws Exception {	   
	   fplMainPage.enterUserName();
	   fplMainPage.enterPassword();
	   fplMainPage.clickLogIn();
	   Thread.sleep(5000);
	   fplMainPage.clickPayBill();
	   Thread.sleep(2000);

	}

	@AfterClass
	public void afterClass() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}

}
