/**
 * 
 */
package com.tutorial.sample.number;

/**
 * @author Gourav_Sharma1
 *
 */
public class NumberSample {

	public int getGreaterNumber(int firstNumber, int secondNumber) {
		int actual = 0;
		System.out.println("SEcond number "+ secondNumber);
		if(firstNumber < secondNumber) {
			return firstNumber;
		} else {
			return secondNumber;
		}
	//	return actual;
	}
}
