package com.wipro.pages;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;
import com.wipro.utilities.Screenshot;

public class MenuLinksClickPage extends TestBaseClass {

	By computers = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
	By electronics = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
	By apparel = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
	By digital = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
	By book = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
	By jewelry = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
	By gift = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
	By link = By.xpath("//ul[@class='top-menu notmobile']/*");

	public void menuLinksTest() throws IOException {

		// to create an object of screenshot class
		Screenshot screenShot = new Screenshot();

		// to click on the computers link button
		driver.findElement(computers).click();
		// to take screenshot of computers
		screenShot.TakeScreenShot(driver, "computer");

		// to click on the electronics link button
		driver.findElement(electronics).click();
		// to take screenshot of electronics
		screenShot.TakeScreenShot(driver, "electronics");

		// to crlick on the Apparel link button
		driver.findElement(apparel).click();
		// to take screenshot of apparel
		screenShot.TakeScreenShot(driver, "apparel");

		// to click on the digital link button
		driver.findElement(digital).click();
		// to take screenshot of digital
		screenShot.TakeScreenShot(driver, "digital download");

		// to click on the book link button
		driver.findElement(book).click();
		// to take screenshot of book
		screenShot.TakeScreenShot(driver, "book");

		// to click on the Jewelry link button
		driver.findElement(jewelry).click();
		// to take screenshot of jewelry
		screenShot.TakeScreenShot(driver, "jewelry");

		// to click on the gift link button
		driver.findElement(gift).click();
		// to take screenshot of gift
		screenShot.TakeScreenShot(driver, "gift card");

		// to locate the textfile with the path
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\SunilKumar\\eclipse-workspace\\demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded\\demonopcommerce_CapstonetProjectBySunilkumar\\src\\test\\resources\\output_data\\NoOfLinksInHomePage.txt");

		// to locate the webElement of the Homepage
		List<WebElement> list = driver.findElements(link);

		System.out.println(list.size());
		int nums = list.size();
		fileWriter.write("Total menus are :" + " " + nums);
		fileWriter.write("\n");
		for (int i = 0; i < nums; i++) {
			String values = list.get(i).getText();
			fileWriter.write(i + 1 + "." + " " + "menu is" + " " + values);
			fileWriter.write("\n");
		}

		// to close the text file
		fileWriter.close();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
