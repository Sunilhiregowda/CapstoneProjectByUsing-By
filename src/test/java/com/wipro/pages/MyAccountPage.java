package com.wipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;

public class MyAccountPage extends TestBaseClass {

	By myAcc = By.xpath("//a[@class='ico-account']");

	public void myacctTest() {

		// to click the my account link button
		driver.findElement(myAcc).click();
	}

}
