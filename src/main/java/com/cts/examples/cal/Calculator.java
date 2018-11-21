package com.cts.examples.cal;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		 System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
		return a + b;  
	}
	 
	public int subtraction(int a, int b) {
	       return a - b;
	}
	 
	public int multiplication(int a, int b) {
		 
		return a * b;
	}

	public int divison(int a, int b)  {
		
		return a / b;
	}
	 
	public boolean equalIntegers(int a, int b) {
		boolean result = false;
            	if (a == b) {
			result = true;
		}
 
		return result;
	}
}
