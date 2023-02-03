package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeInvalidLogin(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Password"));
		Thread.sleep(3000);
		bt.closeBrowser();
		
	}

}

