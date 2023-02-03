package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Which Browser U Want To Open!!");
			String browserValue = s.next();
			if (browserValue.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				driver.close();
			}
			else if (browserValue.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.msedge.driver", "./drivers/msedgedriver.exe");
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				driver.close();
			}
			else
				System.out.println("Enter Valid Browser Name");
		}
		
	}

}
