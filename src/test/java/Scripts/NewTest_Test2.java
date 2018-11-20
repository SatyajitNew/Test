package Scripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mainTest.com.Config.DriverHandler;

public class NewTest_Test2 extends DriverHandler {
  @Test
  public void Test2() {

	  driver.get(baseUrl);
	  
	  boolean displayLogo= driver.findElement(By.xpath(prop.getProperty("logo"))).isDisplayed();
      assertTrue(displayLogo, "Application logo is not displaying");
      
      driver.findElement(By.xpath(prop.getProperty("yourCity"))).sendKeys("invalid city");
      driver.findElement(By.xpath(prop.getProperty("searchButton"))).click();
      String message=driver.findElement(By.xpath(prop.getProperty("warningMessageText"))).getText();
      assertTrue(message.contains("Not found"), "error message is not displaying");
      
  }
}
