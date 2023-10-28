package com.wipro.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;
import com.wipro.utilities.Screenshot;

public class AddressPage extends TestBaseClass {

	By add_link = By.xpath("//li[@class='customer-addresses inactive']//a[normalize-space()='Addresses']");// (//a[normalize-space()='Addresses'])[1]
	By add_new = By.xpath("//button[normalize-space()='Add new']");
	By first_name = By.xpath("//input[@id='Address_FirstName']");
	By last_name = By.xpath("//input[@id='Address_LastName']");
	By e_mail = By.xpath("//input[@id='Address_Email']");
	By country_name = By.xpath("//select[@id='Address_CountryId']");
	By city_name = By.xpath("//input[@id='Address_City']");
	By address_no = By.xpath("//input[@id='Address_Address1']");
	By pin_code = By.xpath("//input[@id='Address_ZipPostalCode']");
	By phone_no = By.xpath("//input[@id='Address_PhoneNumber']");
	By save_button = By.xpath("//button[normalize-space()='Save']");
	By close = By.xpath("//span[@title='Close']");
	By log_out = By.xpath("//a[normalize-space()='Log out']");

	public void addressTest(String fname, String lname, String email, String country, String city, String address,
			String pin, String phone) throws IOException {

		// to create an object of screenshot class
		Screenshot screenShot = new Screenshot();

		// to click on the add address button
		driver.findElement(add_link).click();

		// to click on the new button to add the address
		driver.findElement(add_new).click();

		// to get firstname from excel sheet and enter firstname
		driver.findElement(first_name).sendKeys(fname);

		// to get lastname from excel sheet and enter lastname
		driver.findElement(last_name).sendKeys(lname);

		// to get email details from excel and enter email
		driver.findElement(e_mail).sendKeys(email);

		// to get country name from excel and enter country
		driver.findElement(country_name).sendKeys(country);

		// to get city name details from excel and enter city name
		driver.findElement(city_name).sendKeys(city);

		// to get address details from excel and enter address
		driver.findElement(address_no).sendKeys(address);

		// to get pincode from excel and enter pincode
		driver.findElement(pin_code).sendKeys(pin);

		// to get phone number details from excel and enter phone number
		driver.findElement(phone_no).sendKeys(phone);

		// to click on save button
		driver.findElement(save_button).click();

		// to close the popup
		driver.findElement(close).click();

		// to take screenshot
		screenShot.TakeScreenShot(driver, "addressTest");

		// to logout from the current page
		driver.findElement(log_out).click();

	}

}
