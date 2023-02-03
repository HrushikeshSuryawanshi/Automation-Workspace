package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4ByUsingMultipleAttributes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
//		//multiple attribute by using or operator
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//p[.='Ruby' or (.='Java')]")).click();
		
		//multiple attribute by using and operator
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='card-title font-weight-bold h6' and (.='Ruby')]")).click();
		
		
		Thread.sleep(4000);
		driver.close();
	}

}
