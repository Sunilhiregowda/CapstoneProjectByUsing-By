package com.wipro.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import com.wipro.utilities.*;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import com.wipro.base.TestBaseClass;
import com.wipro.pages.*;

public class TestCase1 extends TestBaseClass {

	@Test(priority = 0, dataProvider = "testdata1")
	public static void Register1(String firstname, String lastname, String email, String password,
			String confirmpassword) throws InterruptedException, IOException {

		// to create an object to call the function registerPage
		RegisterPage registerPage = new RegisterPage();

		// to call the function by using the object
		registerPage.RegisterTest(firstname, lastname, email, password, confirmpassword);

	}

	@DataProvider(name = "testdata1")
	public Object[][] testdata1() throws EncryptedDocumentException, IOException {

		// to store the value from the excel sheet
		Object[][] data = ReadXLData.getData("RegisterPage");

		// to return the stored data
		return data;
	}

	@Test(priority = 1, dataProvider = "testdata2")
	public void Login1(String email, String password) throws InterruptedException {

		// to create an object to call the function
		LoginPage loginPage = new LoginPage();

		// to call the function by using the object
		loginPage.LoginTest(email, password);

	}

	@DataProvider(name = "testdata2")
	public Object[][] testdata2() throws EncryptedDocumentException, IOException {

		// to store the value from the excel sheet
		Object[][] data = ReadXLData.getData("login");

		// to return the stored data
		return data;

	}

	@Test(priority = 2)
	public void logout1() throws IOException {

		// to create an object to call the function
		LogoutPage logoutPage = new LogoutPage();

		// to call the function by using the object
		logoutPage.logoutTest();
	}

}
