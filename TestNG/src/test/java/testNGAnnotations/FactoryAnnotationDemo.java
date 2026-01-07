package testNGAnnotations;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryAnnotationDemo {
	int a;
	int b;
	int sum;
	int multiple;

	public FactoryAnnotationDemo(int num1, int num2) {

		a = num1;
		b = num2;
		sum = a + b;
		multiple = a* b;
	}

	@Test

	public void sum() {

		System.out.println("Sum is: " + sum);
	}
	
	@Test
	public void multipleDemo()
	{
		System.out.println("Multiple number: " + (a*b));
	}

	@Factory
	public static Object[] factoryDemo() {
		
		return new Object[]
				{
						new FactoryAnnotationDemo(5,2),
						new FactoryAnnotationDemo(3,6),
						
				};
	}

}
