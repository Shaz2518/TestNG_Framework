package testNGAttributes;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Attribute_Invocation {

	@Test(invocationCount = 10)
	public void invocationCount() {
		System.out.println("Invocation Count");
	}
	
//	@Test(invocationTimeOut = 1000)
//	public void invocationTimeout() throws InterruptedException {
//		Thread.sleep(1500);
//		System.out.println("Invocation Timeout");
//	}
	
	@Test(threadPoolSize = 2)
	public void threadPoolSize() {
		System.out.println("Thread Pool");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("===========");
	}
}
