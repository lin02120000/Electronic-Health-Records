package assignment01;

import org.junit.Assert;
import org.junit.Test;
/**
 * create a JUnit test for MyHealthData to test the getBMI() method.
 * First inputs health data parameters in the new instantiate object--data, then test the getBMI() method.
 * A successful execution with no errors(Test2).
 * Second change the weight data in the new instantiate object--data,then test the getBMI() method again.
 * A failed execution with the red bar(Test3). 
 * @author Lin
 *
 */

public class MyHealthDataTest3 {

	/**
	 * Default Constructor(no arguments)
	 */
		public MyHealthDataTest3()
		{		
		}
	private static final double EPSILON = 1E-2;
	/**
	 * to test testGetBMI() method comparing with the official authoritative method.
	 * reference: 
	 * https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/english_bmi_calculator/bmi_calculator.html
	 */
	@Test
	public void testGetBMI() 
	{
//      change the weight data from 142.28 to 132.28, get the wrong result and red bar.
		MyHealthData data = new MyHealthData("lin", "chen", "f",1980,2022,68.50,132.28);
		
		double num = data.getBMI();	
//		num = Math.round(num * 100.0)/100.0;
	
	    double expected = 21.32;
	      Assert.assertEquals(expected,num, EPSILON);
	}

}

