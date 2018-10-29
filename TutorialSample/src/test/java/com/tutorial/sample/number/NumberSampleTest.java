/**
 * 
 */
package com.tutorial.sample.number;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Gourav_Sharma1
 *
 */
public class NumberSampleTest {
	
	private static Logger logger = Logger.getLogger(NumberSampleTest.class);
	NumberSample numSample;
	
	@Before
	public void initiateReferences() {
		numSample = new NumberSample();
	}
	
	@Test
	public void greaterNumberTest() {
		int expectedValue = 20;
		int actual;
		
		int firstNumber = 20;
		int secondNumber = 10;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC1:: "+ actual);
		Assert.assertEquals(expectedValue, actual);
	}
	
	@Test
	public void BothNumberEuqualTest() {
		int expectedValue = 20;
		int actual;
		
		int firstNumber = 20;
		int secondNumber = 20;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC2::"+ actual);
		Assert.assertEquals(expectedValue, actual);
	}
	
	@Test
	public void SecondNumberGreaterTest() {
		int expectedValue = 30;
		int actual;
		
		int firstNumber = 20;
		int secondNumber = 30;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC3::"+ actual);
		Assert.assertEquals(expectedValue, actual);
	}
	
	@Test
	public void FirstNumberNegativeTest() {
		int expectedValue = 30;
		int actual;
		
		int firstNumber = -20;
		int secondNumber = 30;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC4::"+ actual);
		Assert.assertEquals(expectedValue, actual);
	}
	
	@Test
	public void SecondNumberNegativeTest() {
		int expectedValue = 20;
		int actual;
		
		int firstNumber = 20;
		int secondNumber = -30;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC5::"+ actual);
		Assert.assertEquals(expectedValue, actual);
	}
	
	@Test
	public void BothNumberNegativeTest() {
		int expectedValue = -20;
		int actual;
		
		int firstNumber = -20;
		int secondNumber = -30;
		
		actual = numSample.getGreaterNumber(firstNumber, secondNumber);
		logger.info("actual:: TC6::"+ actual);
		Assert.assertEquals(expectedValue, actual);
	}

}
