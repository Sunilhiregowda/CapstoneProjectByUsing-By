package com.wipro.pages;

import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.wipro.base.TestBaseClass;

public class LogoutPage extends TestBaseClass {

	By log_out = By.xpath("//a[@class='ico-logout']");

	public void logoutTest() throws IOException {

		// click on logout
		driver.findElement(log_out).click();

		// to locate the textfile with the path
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\SunilKumar\\eclipse-workspace\\demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded\\demonopcommerce_CapstonetProjectBySunilkumar\\src\\test\\resources\\output_data\\LogoutSuccessfullMessage.txt");
		fileWriter.write("logout successful");
		// close the textfile
		fileWriter.close();
	}
}
