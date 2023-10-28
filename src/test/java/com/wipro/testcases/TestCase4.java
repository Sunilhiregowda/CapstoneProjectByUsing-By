package com.wipro.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wipro.base.TestBaseClass;
import com.wipro.pages.*;
import com.wipro.utilities.*;

public class TestCase4 extends TestBaseClass {

	Screenshot screenShot = new Screenshot();

	@Test(priority = 0, dataProvider = "testdata1")
	public void Login4(String email, String password) throws InterruptedException, IOException {

		// to create an object to call the function
		LoginPage loginPage = new LoginPage();

		// to call the function by using the object
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage.LoginTest(email, password);
	}

//	@Test
	@DataProvider(name = "testdata1")
	public Object[][] testdata1() throws EncryptedDocumentException, IOException {

		// to store the value from the excel sheet
		Object[][] data = ReadXLData.getData("login");

		// to return the stored data
		return data;
	}

	@Test(priority = 1)
	public void mymenu() throws IOException {

		// to create an object to call the function
		MenuLinksClickPage menuliksClickPage = new MenuLinksClickPage();

		// to call the function
		menuliksClickPage.menuLinksTest();
	}

	@Test(priority = 3)
	public void logout4() throws IOException {

		// to create an object to call the function
		LogoutPage logoutPage = new LogoutPage();

		// to call the function
		logoutPage.logoutTest();

		// syntax for screenshot
		String n = "logout2";
		screenShot.TakeScreenShot(driver, n);

	}

}
