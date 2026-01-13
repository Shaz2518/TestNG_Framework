package testNGParameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleParameter {

	@Parameters("MessageKey")
	@Test
	public void parametersDemo(String message) {
		System.out.println("This is Parameter Message: " + message);
	}
}
