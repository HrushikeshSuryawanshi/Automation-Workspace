package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StealElementRef {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-lvmpkgtc/login.do");
		Thread.sleep(2000);
		
		WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
		usn.sendKeys("admin");
		System.out.println(usn);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		usn.sendKeys("admin");
		System.out.println(usn);
	}

}

