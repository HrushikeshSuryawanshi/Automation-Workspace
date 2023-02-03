package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nike.com/in/member/profile/login?continueUrl=https://www.nike.com/in/");
		
		Thread.sleep(4000);
		driver.findElement(By.id("6687a9f0-a8bf-4a4a-9c39-5fc454f79936")).sendKeys("abcd@123");
		//driver.findElement(By.cssSelector("input[id='6687a9f0-a8bf-4a4a-9c39-5fc454f79936']")).sendKeys("pqrs@123");
		driver.findElement(By.id("8a7e0fbf-7f06-459d-81ca-7891a3b13f72")).sendKeys("123xyz");
		  Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[id='8a7e0fbf-7f06-459d-81ca-7891a3b13f72']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("33917162-917c-4a3f-8490-f9591db8feb2")).click();
       //driver.findElement(By.cssSelector("input[id='33917162-917c-4a3f-8490-f9591db8feb2']")).click();
}

}
