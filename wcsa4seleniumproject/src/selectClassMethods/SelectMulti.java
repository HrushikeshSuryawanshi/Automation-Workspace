package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMulti {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/nemad/OneDrive/Desktop/Automationdata/Html%20WebElements/MultiSelectDropDown.html");
		WebElement dropDropDownElement = driver.findElement(By.id("menu"));
		Select sel = new Select (dropDropDownElement);
		for(int i=0;i<6;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
	}

}