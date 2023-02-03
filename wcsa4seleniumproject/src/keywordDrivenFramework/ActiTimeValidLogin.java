package keywordDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		String username = flib.readPropertyData(PROP_PATH, "Username");
		String password = flib.readPropertyData(PROP_PATH, "Password");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Login']")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	
		
	}
}
