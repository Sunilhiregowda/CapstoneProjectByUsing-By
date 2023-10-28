package com.wipro.pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;
import com.wipro.utilities.Screenshot;

public class MenuPage extends TestBaseClass {

	By computer = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");

	By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");

	public void menuTest() throws IOException {

		// to create an object of screenshot class
		Screenshot screenShot = new Screenshot();

		String a = "login";
		// to take screenshot
		screenShot.TakeScreenShot(driver, a);

		// click on computer link button
		driver.findElement(computer).click();

		// click on desktop link button
		driver.findElement(desktop).click();

		String n = "desktop";
		// to take screenshot of the page
		screenShot.TakeScreenShot(driver, n);

	}

}
