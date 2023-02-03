package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://laptop-lvmpkgtc/login.do");
		Thread.sleep(2000);
		
		Flib flib = new Flib();
		String Username = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		String Password = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
	}
}
