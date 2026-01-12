package testNGAnnotations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	@Test(dataProvider="iteratorDemo")
	public void iteratorMethod(String str) {
		
		System.out.println(str);
	}
	
	
	
	@DataProvider
	public Iterator<String> iteratorDemo() {
		
		List<String> str = new ArrayList<String>();
		str.add("Virat");
		str.add("Rohit");
		str.add("Rahul");
		str.add("Shreyas");
		
		return str.iterator();
		
	}
	
	
	//Iterator<Object[]>
	@Test(dataProvider="iteratorarrayDemo")
	public void iteratorArrayObjectDemo(String[] s) {
		System.out.println(s[0] + " " + s[1]);
	}
	
	@DataProvider
	public Iterator<String[]> iteratorarrayDemo(){
		List<String[]> names = new ArrayList<String[]>();
		
		names.add(new String[] {"Virat", "Kohli"});
		names.add(new String[] {"Rohit", "Sharma"});
		names.add(new String[] {"Rahul", "KL"});
		names.add(new String[] {"Shreyas","Iyer"});
		
		return names.iterator();
	}
	
	
	
	
	

}
