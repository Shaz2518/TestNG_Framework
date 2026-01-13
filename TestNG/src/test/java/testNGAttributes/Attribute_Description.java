package testNGAttributes;

import org.testng.annotations.Test;

public class Attribute_Description {

	@Test(description = "This method give description")
	public void descriptionMethod() {
		
		System.out.println("Description Test Method");
	}
}
