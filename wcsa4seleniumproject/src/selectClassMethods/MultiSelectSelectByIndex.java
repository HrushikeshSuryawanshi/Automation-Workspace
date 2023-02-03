package selectClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectSelectByIndex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.get("file:///C:/Users/nemad/OneDrive/Desktop/Automationdata/Html%20WebElements/MultiSelectDropDown.html");
		
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		
		Select sel = new Select(dropDownElement);
		sel.selectByIndex(5);

	}

}
