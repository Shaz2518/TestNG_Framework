package testNGAttributes;

import org.testng.annotations.Test;

public class Attribute_Timeout {

	
	@Test(timeOut = 100)
	public void timeoutDemo() throws InterruptedException {
		Thread.sleep(150);
		System.out.println("This is timeout Attribute Demo");
	}
}
