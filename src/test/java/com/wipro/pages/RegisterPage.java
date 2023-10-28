package com.wipro.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.io.*;
import com.wipro.utilities.*;
import com.wipro.base.TestBaseClass;

public class RegisterPage extends TestBaseClass {

	By register_link = By.xpath("//a[contains(text(),'Register')]");
	By gender = By.xpath("//input[@id='gender-male']");
	By first_name = By.xpath("//input[@id='FirstName']");
	By last_name = By.xpath("//input[@id='LastName']");
	By register_email = By.xpath("//input[@id='Email']");
	By register_password = By.xpath("//input[@id='Password']");
	By confirm_password = By.xpath("//input[@id='ConfirmPassword']");
	By register_button = By.xpath("//button[@id='register-button']");

	public void RegisterTest(String fname, String lname, String email, String pwd, String cpwd)
			throws IOException, InterruptedException {

		Thread.sleep(1000);
		// to locate the textfile with the path
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\SunilKumar\\eclipse-workspace\\demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded\\demonopcommerce_CapstonetProjectBySunilkumar\\src\\test\\resources\\output_data\\RegistrationSuccessfullMessage.txt");

		// to click the register button
		driver.findElement(register_link).click();

		Thread.sleep(1000);
		// to click on the specified gender
		driver.findElement(gender).click();

		// to get firstname from excel sheet and enter firstname
		driver.findElement(first_name).sendKeys(fname);

		// to get lastname from excel sheet and enter lastname
		driver.findElement(last_name).sendKeys(lname);

		// to select the date from the dropdown
		Select day = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthDay']")));
		day.selectByValue("26");

		// to select the month from the dropdown
		Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
		month.selectByIndex(10);

		// to select the year from the dropdown
		Select year = new Select(driver.findElement(By.cssSelector("select[name='DateOfBirthYear']")));
		year.selectByValue("2000");

		// to get email details from excel and enter email
		driver.findElement(register_email).sendKeys(email);
		// to get password details from excel and enter password

		driver.findElement(register_password).sendKeys(pwd);
		// to get confirm password details from excel and enter confirm password

		driver.findElement(confirm_password).sendKeys(cpwd);
		// to click on the register button

		driver.findElement(register_button).click();
		// to get xpath of the result and store it in webelement regSuccessMessage

		WebElement regSuccessMessage = driver.findElement(By.xpath("//div[@class='result']"));

		// to get text from web element regSuccessMessage
		String regSuccessfulMessage = regSuccessMessage.getText();

		// to write the text in the text file
		fileWriter.write(regSuccessfulMessage);
		// to close the text file
		fileWriter.close();

		Thread.sleep(1000);

		// to create an object of screenshot class
		Screenshot screenShot = new Screenshot();
		screenShot.TakeScreenShot(driver, "success");

	}

}
