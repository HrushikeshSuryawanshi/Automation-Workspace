package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.LoginPage;


public class ActiTimeValidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		
	}

}
