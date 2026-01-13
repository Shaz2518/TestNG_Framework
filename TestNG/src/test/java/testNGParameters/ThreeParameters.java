package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThreeParameters {
	
	@Parameters({"Name", "Email", "Address"})
	@Test
	public void threeParameters(String name, String email, String address) {
		
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Address: " + address);
		
		
	}

}
