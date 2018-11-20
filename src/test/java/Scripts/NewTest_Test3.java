package Scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.mainTest.com.Config.DriverHandler;


public class NewTest_Test3 extends DriverHandler {
  @Test
  public void Test3() {
	  
	  driver.get(baseUrl);
       
	  boolean displayLogo= driver.findElement(By.xpath(prop.getProperty("logo"))).isDisplayed();
      assertTrue(displayLogo, "Application logo is not displaying");
     
      driver.findElement(By.xpath(prop.getProperty("yourCity"))).sendKeys("mumbai");
      driver.findElement(By.xpath(prop.getProperty("searchButton"))).click();
      boolean city=driver.findElement(By.xpath(prop.getProperty("searchResult"))).getText().contains("mumbai");
      
      assertTrue(city, "city name is not displaying properly");
  }
}
