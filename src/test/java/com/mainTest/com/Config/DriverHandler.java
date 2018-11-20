package com.mainTest.com.Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class DriverHandler {
	public WebDriver driver;
	public String baseUrl="https://openweathermap.org/";
	
	public Properties prop;
	
	@BeforeTest
	public void initializeChrome() throws FileNotFoundException, IOException {
	System.setProperty("webdriver.chrome.driver", "G:\\selenium_practice\\chromedriver_win32\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
     
      prop=new Properties();
		  prop.load(new FileInputStream("G:\\Selenium_13thAug\\ws\\com.TestDemo\\src\\test\\java\\com\\mainTest\\com\\Config\\input.properties"));
		//  prop.load(new FileInputStream(".\\com\\mainTest\\com\\Config\\input.properties"));
	 
     
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
  
}
