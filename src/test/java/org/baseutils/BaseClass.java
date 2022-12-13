package org.baseutils;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser()
	{
		System.out.println("Launch Browser");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	public static void typeData(WebElement element,String data)
	{
		element.sendKeys(data);
		
	}
	@AfterClass
	public static void closeBrowser()
	{
		System.out.println("Close browser");
		driver.close();
	}

}
