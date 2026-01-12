package testNGAttributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Attribute_Enabled {

	@Test(dataProvider = "dataProviderMethod" , enabled = true)
	public void loginData(String username, String password) {
		System.out.println("Data Provider Demo");
		
		System.out.println(username + " " + password);
	}
	
	@Test(dataProvider = "dataProviderMethod")
	public void loginDataDemo(String username, String password) {
		System.out.println("Login Data Provider Demo");
		
		System.out.println(username + " " + password);
	}
	
	
	@DataProvider
	public Object[][] dataProviderMethod(){
		
		return new Object[][]
				{
			
			{"user1" ,"password1"},
			{"user2" , "password2"},
			{"user3" , "password3"}
			
		};
	}
}
