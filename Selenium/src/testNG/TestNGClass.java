package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass 
{
  @Test
  public void test1()
  {
	  Reporter.log("Hello",true);
  }
}
