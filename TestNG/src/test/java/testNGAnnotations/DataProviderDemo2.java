package testNGAnnotations;

import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	@Test (dataProvider = "LoginMethod" , dataProviderClass = DataProviderClass.class)
	public void dataProviderLogin(String username, String password) {
		
		System.out.println(username + " " + password);
	}
	
	@Test (dataProvider = "ProfileMethod", dataProviderClass = DataProviderClass.class)
	public void dataProviderProfile(String name, String email, String address) {
		System.out.println(name + " " + email + " " + address);
	}
	
	
	
	
	
	
	

}
