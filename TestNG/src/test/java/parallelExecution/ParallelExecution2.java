package parallelExecution;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	
	
	@Test
	public void parallelExec1() {
		System.out.println("Method 1: " + Thread.currentThread().getId());
	}
	
	@Test
	public void parallelExec2() {
		System.out.println("Method 2: " + Thread.currentThread().getId());
	}
	
	@Test
	public void parallelExec3() {
		System.out.println("Method 3: " + Thread.currentThread().getId());
	}
	
	@Test
	public void parallelExec4() {
		System.out.println("Method 4: " + Thread.currentThread().getId());
	}

	@Test
	public void parallelExec5() {
		System.out.println("Method 5: " + Thread.currentThread().getId());
	}
}
