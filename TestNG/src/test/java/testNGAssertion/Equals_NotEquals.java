package testNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Equals_NotEquals {
	
	@Test
	public void assertMethod() {
		String str = "Hello";
		String newStr = "Hello";
		
		Assert.assertEquals(str, newStr);
		System.out.println("Assertion Equals Demo");
		
		String notEqualStr = "World";
		String notEqualNewStr= "Worl";
		
		Assert.assertNotEquals(notEqualStr, notEqualNewStr);
		System.out.println("Assert Not Equals Demo");
		
	}
	
	
	
	
	

}
