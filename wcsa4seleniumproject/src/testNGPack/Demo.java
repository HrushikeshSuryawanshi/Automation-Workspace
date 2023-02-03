package testNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {

  @Test
  public void demo() {
	  Reporter.log("From demo method",true);
  }
  
  @Test
  public void demo1() {
	  Reporter.log("From demo1 method",true);
  }
  
  @Test
  public void demo2() {
	  int a = 10;
	  int b = 0;
	  int res = a/b;
	  Reporter.log("From demo2 method"+ res,true);
  }
}
