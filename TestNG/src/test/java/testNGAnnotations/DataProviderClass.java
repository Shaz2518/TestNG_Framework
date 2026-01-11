package testNGAnnotations;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider (name="LoginMethod")
	public Object[][] dataProviderLoginClass() {

		return new Object[][] {

				{ "user1", "password1" }, 
				{ "user2", "password2" }, 
				{ "user3", "password3" } };

	}

	@DataProvider (name = "ProfileMethod")
	public Object[][] dataProviderProfileClass() {
		return new Object[][] {

				{ "name1", "email1", "address1" }, 
				{ "name2", "email2", "address2" },
				{ "name3", "email3", "address3" } };

	}

}
