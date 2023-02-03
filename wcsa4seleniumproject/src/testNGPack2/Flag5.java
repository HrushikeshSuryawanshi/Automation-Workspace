package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5 {
 
	@Test(priority = 3)
  public void z() {
	  Reporter.log("z",true);
  }
	
	@Test(priority = 1)
	  public void h() {
		  Reporter.log("h",true);
	  }
	
	@Test
	  public void k() {
		  Reporter.log("k",true);
	  }
	
	@Test
	  public void g() {
		  Reporter.log("g",true);
	  }
	
	@Test(priority = 2)
	  public void p() {
		  Reporter.log("p",true);
	  }
	
	@Test(priority = 0)
	  public void i() {
		  Reporter.log("i",true);
	  }
}
