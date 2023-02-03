package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3ByUsingContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//contains by using attribute
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(@class,'selenium-button selenium-webdriver text-uppercase font-weight-bold')]")).click();
		
//		//contains by using text()
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//a[contains(.,'Read more')]")).click();
//		
		
		Thread.sleep(4000);
		driver.close();
	}

}
