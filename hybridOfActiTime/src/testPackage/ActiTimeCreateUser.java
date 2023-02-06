package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BaseTest{
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.clickOnUsers();
		UsersPage up = new UsersPage(driver);
		up.clickOnTab();
		up.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
		up.validPass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
		up.reTypePass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
		up.firstName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 2));
		up.lastName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 3));
		up.clickOnCreateUserButton();
		Thread.sleep(3000);
		
		
		
	}
}
