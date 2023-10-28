package com.wipro.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class TestBaseClass {

	public static WebDriver driver = null;

	Properties properties = new Properties();
	FileReader filereader;

	@BeforeSuite
	public void setUp() throws IOException {
		if (driver == null) {
			filereader = new FileReader(
					"C:\\Users\\SunilKumar\\eclipse-workspace\\demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded\\demonopcommerce_CapstonetProjectBySunilkumar\\src\\test\\resources\\configfiles\\config.properties");
			properties.load(filereader);
		}
		if (properties.getProperty("browser").equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "/Users/su20463093/eclipse-workspace/BackUpProject/demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded/demonopcommerce_CapstonetProjectBySunilkumar/src/test/resources/driverfiles/chromedriver");
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(properties.getProperty("testurl"));
		} else if (properties.getProperty("browser").equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.edge.driver",
			// "/Users/su20463093/eclipse-workspace/BackUpProject/demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded/demonopcommerce_CapstonetProjectBySunilkumar/src/test/resources/driverfiles/msedgedriver");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(properties.getProperty("testurl"));
		} else if (properties.getProperty("browser").equalsIgnoreCase("safari")) {
			// System.setProperty("webdriver.safari.driver", "path");
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			driver.get(properties.getProperty("testurl"));
		} else {
			// System.setProperty("webdriver.gecko.driver",
			// "/Users/su20463093/eclipse-workspace/BackUpProject/demonopcommerce_CapstonetProjectBySunilkumar.zip_expanded/demonopcommerce_CapstonetProjectBySunilkumar/src/test/resources/driverfiles/geckodriver");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get(properties.getProperty("testurl"));
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void windUp() {
		driver.close();
		driver.quit();
	}
}
