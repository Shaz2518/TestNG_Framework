package testNGListeners;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersDemo.class)
public class ListenersClass {
	
	@Test
	public void listenerDemo() {
		System.out.println("LISTNER DEMO METHOD");
	}
	
	@Test
	public void listenerPractice() {
		System.out.println("Method 2");
	}
	
	@Test(timeOut = 1000)
	public void failureTimeoutDemo() throws InterruptedException {
		Thread.sleep(1200);
		System.out.println("Failure Timeout");
	}
	
	@Test(dependsOnMethods = "failureTimeoutDemo")
	public void skippedTestDemo() {
		System.out.println("Skipped Timeout");
	}
	
	@Test
	public void failureTestDemo() {
		Assert.assertEquals("TestNG", "TestNGDemo");
	}
}
