package testNGAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {

	@Test
	public void softAssertionDemo() {
		
		String str = "Hello";
		String newStr = "Hello";
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(str, newStr);
		System.out.println("Soft Assertion Equals");
		
		String string = "World";
		String newString = "Worl";
		
		softAssert.assertNotEquals(string, newString);
		System.out.println("Soft Not Equals");
		
		String nullStr = "";
		softAssert.assertNotNull(nullStr);
		System.out.println("Not Null Demo");
		
		softAssert.assertNull(nullStr);
		System.out.println("Null Demo");
		
		
		softAssert.assertAll();

	}
}
