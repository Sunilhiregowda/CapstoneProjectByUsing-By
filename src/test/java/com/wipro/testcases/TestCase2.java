package com.wipro.testcases;

import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.wipro.base.TestBaseClass;
import com.wipro.pages.*;
import com.wipro.utilities.ReadXLData;

public class TestCase2 extends TestBaseClass {

	@Test(priority = 0, dataProvider = "testdata1")
	public void Login2(String email, String password) throws InterruptedException, IOException {

		// to create an object to call the function
		LoginPage loginPage = new LoginPage();

		// to call the function by using the object
		loginPage.LoginTest(email, password);

	}

	@DataProvider(name = "testdata1")
	public String[][] testdata1() throws EncryptedDocumentException, IOException {

		// to store the value from the excel sheet
		String[][] data = ReadXLData.getData("login");

		// to return the stored data
		return data;

	}

	@Test(priority = 1)
	public void Myaccfunctionality() {

		// to create an object to call the function
		MyAccountPage myaccountPage = new MyAccountPage();

		// to call the function by using the object
		myaccountPage.myacctTest();

	}

	@Test(priority = 2, dataProvider = "testdata2")
	public void addressfuctionality(String fname, String lname, String email, String country, String city,
			String address, String pin, String phone) throws IOException {

		// to create an object to call the function
		AddressPage addressPage = new AddressPage();

		// to call the function by using the object
		addressPage.addressTest(fname, lname, email, country, city, address, pin, phone);

	}

	@DataProvider(name = "testdata2")
	public Object[][] testdata2() throws EncryptedDocumentException, IOException {

		// to store the value from the excel sheet
		Object[][] data = ReadXLData.getData("Address");

		// to return the stored data
		return data;

	}

}
