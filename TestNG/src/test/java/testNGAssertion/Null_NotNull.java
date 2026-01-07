package testNGAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Null_NotNull {

	@Test
	public void assertNull() {
		
		String str = "Hello";
		Assert.assertNotNull(str);
		
		System.out.println("Assert Not Null Demo");
		
		String nullStr = null;
		Assert.assertNull(nullStr);
		
		System.out.println("Assert Null Demo");
	}
}
