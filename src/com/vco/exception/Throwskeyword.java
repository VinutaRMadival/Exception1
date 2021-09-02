package com.vco.exception;

public class Throwskeyword {
	public static void check()throws ArithmeticException
	{
		System.out.println("inside check function");
		throw new ArithmeticException("demo");
	}

	public static void main(String[] args) {
		try
		{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught"+e);
		}
	

	}

}
