package takesScreenshotDynamic;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListner.class)
public class ActiTimeTestNgLogin extends BaseTest{
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void loginPage()
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle, "Hrushikesh");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		sa.assertAll();
	}
	
	@Test (priority = 1)
	public void homePage() throws InterruptedException
	{
		SoftAssert sa = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle, "actiTIME - Login");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		String actualHomePageTitle = driver.getTitle();
		sa.assertEquals(actualHomePageTitle, "actiTIME - Enter Time-Track");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitTTButton")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
