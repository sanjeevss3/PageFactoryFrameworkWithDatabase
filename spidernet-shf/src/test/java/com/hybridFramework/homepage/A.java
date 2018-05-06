package com.hybridFramework.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.hybridFramework.testBase.TestBase;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class A extends TestBase{

	 static WebDriver driver;

	@Test
	public static void getDriver()

	{
//		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver");
//		driver = new FirefoxDriver();
		System.out.println("!!!!!!!!!!!");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
	}

//	@Test
//	public static void closeBrowser() {
//
//	//	driver.close();
//
//	}

}
