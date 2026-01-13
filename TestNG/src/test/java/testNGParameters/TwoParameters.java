package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TwoParameters {
	
	@Parameters({"username" , "password"})
	@Test
	public void testMethod1 (String username, String password) {
		
		System.out.println(username + " " + password);
	}

}
