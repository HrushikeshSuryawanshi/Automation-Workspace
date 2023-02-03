package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i =1; i <= rc; i++)
		{
			String usn = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String psw = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usn);
			driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(psw);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Login']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='username']")).clear();
			
		}
		bt.closeBrowser();
	}

}
