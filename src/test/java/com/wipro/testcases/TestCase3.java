package com.wipro.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wipro.base.TestBaseClass;
import com.wipro.pages.*;
import com.wipro.utilities.ReadXLData;

public class TestCase3 extends TestBaseClass {

	@Test(priority = 0, dataProvider = "testdata1")
	public void Login3(String email, String password) throws InterruptedException, IOException {

		// to create an object to call the function
		LoginPage loginPage = new LoginPage();

		// to call the function by using the object
		loginPage.LoginTest(email, password);
	}

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
		MenuPage menuPage = new MenuPage();

		// to call the function
		menuPage.menuTest();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 2)

	public void myselect() throws IOException {

		// to create an object to call the function
		SelectPage selectPage = new SelectPage();

		// to call the function
		selectPage.selectTest();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

//	@Test(priority = 3)
//	public void logout3() throws IOException {

//		// to create an object to call the function
//		LogoutPage logoutpage = new LogoutPage();

//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		// to call the function

//		logoutpage.logoutTest();
//	}

}
