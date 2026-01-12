package testNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_ParallelExecution {

	@Test(dataProvider = "dataProviderMethod")
	public void loginData(String username, String password) {
		
		
		System.out.println(username + " " + password);
	}
	
	
	@DataProvider(parallel = true)
	public Object[][] dataProviderMethod(){
		
		return new Object[][]
				{
			
			{"user1" ,"password1"},
			{"user2" , "password2"},
			{"user3" , "password3"},
			{"user4" ,"password4"},
			{"user5" ,"password5"},
			{"user6" ,"password6"},
			
		};
	}
}
