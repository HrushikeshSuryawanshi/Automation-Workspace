package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		Point targetposition = new Point(30, 250);
		driver.manage().window().setPosition(targetposition);
		Thread.sleep(4000);
		Dimension targetsize = new Dimension(30, 250);
		driver.manage().window().setSize(targetsize);
		Thread.sleep(4000);
		driver.close();
	}


}
