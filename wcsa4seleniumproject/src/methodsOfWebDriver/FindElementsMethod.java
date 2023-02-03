package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(4000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
//		//using for loop
//		for(int i=0;i<suggestions.size();i++)
//		{
//			WebElement options = suggestions.get(i);
//			String opt = options.getText();
//			Thread.sleep(2000);
//			System.out.println(opt);
//			
//		}
		//using for each loop
		for(WebElement options: suggestions)
		{
			String opt = options.getText();
			Thread.sleep(2000);
			System.out.println(opt);
					
		}
		
		Thread.sleep(4000);
		driver.close();
	}


}
