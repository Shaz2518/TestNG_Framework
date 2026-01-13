package testNGAnnotations;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeAfter_Groups {
	
	@BeforeGroups(groups = "smoke")
	public void beforeGroup() {
		System.out.println("Before Group");
	}
	
	@AfterGroups(groups = "smoke")
	public void afterGroup() {
		System.out.println("After Group");
	}
	
	@Test(groups = "smoke")
	public void smokeGroup() {
		System.out.println("Smoke Group");
	}

}
