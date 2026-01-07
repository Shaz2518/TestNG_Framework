package testNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethod_AfterMethod {

	@Test
	public void mainMethod() {
		System.out.println("This is Test Main Method");
	}
	
	@Test
	public void testMethod() {
		System.out.println("This is Test Method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method Test");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method Test");
	}
}
