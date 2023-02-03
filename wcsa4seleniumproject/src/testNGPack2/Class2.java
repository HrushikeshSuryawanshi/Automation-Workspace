package testNGPack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Class2 {
	static WebDriver driver;
	  @Test
	  public void mt() {
		  System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  driver.get("https://www.google.com");
		  driver.switchTo().activeElement().sendKeys("Manual Testing");
		  driver.quit();
		  
	  }
  
}
