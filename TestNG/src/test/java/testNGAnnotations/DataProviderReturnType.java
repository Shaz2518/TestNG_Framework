package testNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReturnType {
	
	//Object
	@Test(dataProvider = "SingleData")
	public void loginData(String username) {
		
		System.out.println(username);
	}
	
	@DataProvider (name="SingleData")
	public Object[] singleDimension() {
		
		String[] name = new String[] {
				"user1",
				"user2",
				"user3",
				
		};
		return name;
	}
	
	
	
	
	//Object[][]
	@Test(dataProvider = "MultiData")
	public void loginDataProvider(String username, String password) {
		
		System.out.println(username + " " + password);
	}
	
	@DataProvider (name="MultiData")
	public Object[][] MultiDimension() {
		
		String[][] name = new String[][] {
				{"user1", "password1"},
				{"user2", "password2"},
				{"user3", "password3"},
				
		};
		return name;
	}
	//Iterator<Object>
	//Iterator<Object[]>
	
	
	

}
