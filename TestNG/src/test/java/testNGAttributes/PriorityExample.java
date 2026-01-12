package testNGAttributes;

import org.testng.annotations.Test;

public class PriorityExample {
	
	//Login Page
	@Test(priority = 9)
	public void loginPage() {
		System.out.println("Login Page");
	}
	
	//Product Page
	@Test(priority = 2)
	public void productPage() {
		System.out.println("Product Page");
	}
	
	//Cart Page
	@Test(priority = 3)
	public void cartPage() {
		System.out.println("Cart Page");
	}
	
	//Checkout Page
	@Test(priority = 4)
	public void checkoutPage() {
		System.out.println("Checkout Page");
	}
	
	//Payment Page
	@Test(priority = 5)
	public void paymentPage() {
		System.out.println("Payment Page");
	}
	
}
