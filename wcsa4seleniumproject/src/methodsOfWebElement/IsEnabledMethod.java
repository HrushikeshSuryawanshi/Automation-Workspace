package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Abcd123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,' _aijb _acas _aj1-')]"));
		boolean status = loginButton.isEnabled();
		System.out.println(status);
	}

}
