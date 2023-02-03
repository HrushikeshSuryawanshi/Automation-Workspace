package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcd@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='_acan _aiit _acap _aijb _acas _aj1-']")).click();

	}

}
