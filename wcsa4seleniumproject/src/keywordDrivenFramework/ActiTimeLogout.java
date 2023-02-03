package keywordDrivenFramework;

import java.io.IOException;

import pageObjectModel.LoginPage;

public class ActiTimeLogout extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		Thread.sleep(3000);
		
		HomePage hp = new HomePage(driver);
		hp.selectUser(1);
		Thread.sleep(3000);
		hp.logOut();
		
		Thread.sleep(3000);
		bt.closeBrowser();
		
	}

}
