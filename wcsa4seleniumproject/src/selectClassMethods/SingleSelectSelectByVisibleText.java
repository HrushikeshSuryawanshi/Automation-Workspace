package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectSelectByVisibleText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  
		  driver.get("file:///C:/Users/nemad/OneDrive/Desktop/Automationdata/Html%20WebElements/SingleSelectDropDown.html");
		  
		  WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='menu']"));
		  
		  Select sel = new Select(dropDownElement);
		  Thread.sleep(4000);
		  sel.selectByVisibleText("Vadapav");
	}


}
