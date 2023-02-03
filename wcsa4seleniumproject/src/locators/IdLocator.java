package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("abcd123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("pass")).sendKeys("abcd");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(9000);
		driver.close();
	}


}
