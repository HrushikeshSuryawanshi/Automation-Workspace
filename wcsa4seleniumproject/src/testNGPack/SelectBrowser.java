package testNGPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	 WebDriver driver;
	  @Test
	  @Parameters({"browserValue","url"})
	  public void openBrowser(String browser,String Url) 
	  {
		  
		  if(browser.equals("chrome"))
		  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(Url);
		  }
		  
		  else if(browser.equals("msedge"))
		  {
			  System.setProperty("webdriver.msedge.driver","./drivers/msedgedriver.exe");
			  driver=new EdgeDriver();
			  driver.manage().window().maximize();
			  driver.get(Url);
		  }
		  else
		  {
			  Reporter.log("enter valid browserValue",true);
		  }
	  }
}
