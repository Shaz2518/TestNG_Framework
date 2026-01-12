package testNGAttributes;

import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups = {"smoke", "sanity"})
  public void testMethod1() {
	  
	  System.out.println("Test1");
  }
  
  @Test(groups = "functional")
  public void testMethod2() {
	  System.out.println("Test2");
  }
  
  @Test(groups = {"smoke", "functional"})
  public void testMethod3() {
	  System.out.println("Test3");
  }
  
  @Test(groups = "sanity")
  public void testMethod4() {
	  System.out.println("Test4");
  }
  
  @Test (groups = {"smoke", "sanity" , "functional"})
  public void testMethod5() {
	  System.out.println("Test5");
  }
  
  @Test(groups = {"sanity","functional"})
  public void testMethod6() {
	  System.out.println("Test6");
  }
}
