package Scripts;

import static org.testng.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.mainTest.com.Config.DriverHandler;

public class NewTest extends DriverHandler {
  @Test
  public void Test() throws FileNotFoundException, IOException {
      driver.get(baseUrl);
     boolean displayLogo= driver.findElement(By.xpath(prop.getProperty("logo"))).isDisplayed();
      assertTrue(displayLogo, "Application logo is not displaying");
     String text1=driver.findElement(By.xpath(prop.getProperty("mainNavHeader"))).getText();
     assertTrue(text1.contains("Support Center\n" + 
     		"Sign Up\n" + 
     		"Sign In\n" + 
     		"Weather in your city\n" + 
     		"°C\n" + 
     		"°F"), "First navigation is not displaying properly");
     boolean searchForm=driver.findElement(By.xpath(prop.getProperty("searchForm"))).isDisplayed();
     assertTrue(searchForm, "Search form is not displaying");
   
	  }
}
