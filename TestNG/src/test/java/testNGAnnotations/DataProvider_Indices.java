package testNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Indices {

	@Test(dataProvider = "Login")
	public void loginData(String username, String password) {
		System.out.println("Data Provider Demo");
		
		System.out.println(username + " " + password);
	}
	
	
	@DataProvider(name = "Login")
	public Object[][] dataProviderMethod(){
		
		return new Object[][]
				{
			
			{"user1" ,"password1"},
			{"user2" , "password2"},
			{"user3" , "password3"}
			
		};
	}
}
