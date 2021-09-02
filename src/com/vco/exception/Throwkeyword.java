package com.vco.exception;

public class Throwkeyword {
	public static void validate()
	{
		try
		{
			throw new ArithmeticException("demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught");
		}
		
		
	}

	public static void main(String[] args) {
		validate();
		System.out.println("rest of code");
		
	}

}
