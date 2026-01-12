package testNGAttributes;

import org.testng.annotations.Test;

public class Attribute_dependsOnMethod {
	
	@Test
	public void parentMethod() {
		System.out.println("This is Parent Method");
	}
	
	@Test(dependsOnMethods = {"parentMethod" , "grandParentMethod"})
	public void childMethod() {
		System.out.println("This is Child Method");
	}
	
	@Test
	public void grandParentMethod() {
		System.out.println("This is Grand Parent");
	}

}
