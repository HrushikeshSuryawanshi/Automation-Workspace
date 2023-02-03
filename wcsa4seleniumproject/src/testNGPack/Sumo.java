package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	 @Test
	  public void sumo() {
		  Reporter.log("From sumo method",true);
	  }
	  
	  @Test
	  public void sumo1() {
		  Reporter.log("From sumo1 method",true);
	  }
	  
	  @Test
	  public void sumo2() {
		  Reporter.log("From sumo2 method",true);
	  }
}
