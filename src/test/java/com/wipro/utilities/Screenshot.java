package com.wipro.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;
import com.wipro.base.TestBaseClass;

public class Screenshot extends TestBaseClass {

	public void TakeScreenShot(WebDriver driver, String name) throws IOException {

		Date date = new Date();
		String curr_date = date.toString().replace(" ", "-").replace(":", "-");
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File file = screenShot.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File(System.getProperty("user.dir") + "/src/test/resources/screenShots",
				name + curr_date + ".jpg"));

//		File source =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File dest = new File("/Users/su20463093/eclipse-workspace/demonopcommerce_CapstonetProjectBySunilkumar/src/test/resources/screenShots"+name+System.currentTimeMillis()+".png");
//		Files.copy(source, dest);
//		FileHandler.copy(source,dest);

	}

}
