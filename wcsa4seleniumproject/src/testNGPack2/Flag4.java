package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void logIn() {
	  Reporter.log("Login Done!!",true); 
	  
  }
  
  @Test(dependsOnMethods = "logIn")
  public void createUser() {
	  Reporter.log("Create User Done!!",true);
	  
  }
  
  @Test(dependsOnMethods = "createUser")
  public void logOUT() {
	  Reporter.log("Logout Done!!",true);
	  
  }
}
