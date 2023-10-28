package com.wipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;

public class LoginPage extends TestBaseClass {

	By log_in = By.xpath("//a[@class='ico-login']");
	By login_email = By.xpath("//input[@id='Email']");
	By login_password = By.xpath("//input[@id='Password']");
	By remember_me = By.xpath("//input[@id='RememberMe']");
	By login_button = By.xpath("//button[normalize-space()='Log in']");

	public void LoginTest(String email, String password) throws InterruptedException {

		// click on login button
		driver.findElement(log_in).click();

		Thread.sleep(1000);
		// get email details from excel and enter email
		driver.findElement(login_email).sendKeys(email);

		// get password details from excel and enter password
		driver.findElement(login_password).sendKeys(password);

		// to click on the remember me button
		driver.findElement(remember_me).click();

		// click on login button
		driver.findElement(login_button).click();
	}

}
