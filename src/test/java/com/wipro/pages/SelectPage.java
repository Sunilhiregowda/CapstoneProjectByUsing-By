package com.wipro.pages;

import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.wipro.base.TestBaseClass;
import com.wipro.utilities.Screenshot;

public class SelectPage extends TestBaseClass {
	By sct = By.xpath(
			"//h2[@class='product-title']//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]");
	By addcart = By.xpath("//button[@id='add-to-cart-button-2']");
//	By close = By.xpath("(//span[@class='Close'])");
	By shop = By.xpath("//a[normalize-space()='shopping cart']");
//	By shop = By.xpath("(//span[@class='cart-label'])[1]");
	By agree = By.xpath("//input[@id='termsofservice']");
	By button = By.xpath("//button[@id='checkout']");
	By contu1 = By.xpath("//button[@onclick='Billing.save()']");
	By contu2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
	By contu3 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
	By contu4 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
	By confirm = By.xpath("//button[normalize-space()='Confirm']");
	By log_out = By.xpath("//a[normalize-space()='Log out']");

	public void selectTest() throws IOException {

		// to create the object of screenshot class
		Screenshot screenShot = new Screenshot();

		// to click on select button
		driver.findElement(sct).click();

		// to click on add to cart button
		driver.findElement(addcart).click();

		// to locate the textfile with the path
		FileWriter filewriter = new FileWriter(
				"C:\\Users\\SunilKumar\\eclipse-workspace\\demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded\\demonopcommerce_CapstonetProjectBySunilkumar\\src\\test\\resources\\output_data\\PrizeOfTheDigitalStormVanquish3CustomePerformancePC.txt");

		// to get xpath of the result and store it in webelement webelement1
		WebElement webelement1 = driver.findElement(By.xpath("//span[@id='price-value-2']"));
		// to get text from web element x
		String a = webelement1.getText();

		// to get xpath of the result and store it in webelement webelement2
		WebElement webelement2 = driver
				.findElement(By.xpath("//h1[normalize-space()='Digital Storm VANQUISH 3 Custom Performance PC']"));
		// to get text from web element w
		String b = webelement2.getText();

		// to write the text in the text file
		filewriter.write("The prize is :");
		filewriter.write(a);
		filewriter.write("\n");
		filewriter.write(b);
		// to close the text file
		filewriter.close();

		// to click on add to cart link button in the pop up message
		driver.findElement(shop).click();

		// to enable the agree check-box
		driver.findElement(agree).click();

		// to click on checkout button
		driver.findElement(button).click();

		// to click the continue button at Billing Address
		driver.findElement(contu1).click();

		// to click the continue button at Shipping method
		driver.findElement(contu2).click();

		// to click the continue button at Payment method
		driver.findElement(contu3).click();

		// to click the continue button at Payment information
		driver.findElement(contu4).click();

		// to click on confirm button
		driver.findElement(confirm).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(log_out).click();

		String n = "confirm";

		// to take screenshot of the page
		screenShot.TakeScreenShot(driver, n);

	}

}
