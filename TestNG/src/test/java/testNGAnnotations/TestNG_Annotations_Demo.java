package testNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations_Demo {

	@Test
	public void testMethodDemo1() {
		System.out.println("Lets Test: Square1");
	}
	@Test
	public void testMethodDemo2() {
		System.out.println("Lets Test: Square2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test: Square");
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test: Square");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class: Square");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class: Square");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite: Square");
		
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite: Square");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method: Square");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method: Square");
	}
}
