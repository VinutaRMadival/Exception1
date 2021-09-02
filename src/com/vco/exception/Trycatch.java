package com.vco.exception;

public class Trycatch {

	public static void test()
	{
		try
		{
			int a[]=new int[5];
			//a[5]=num/0;
			a[5]=4;
			System.out.println(a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("cannot possible");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("not possible");
		}
		catch(Exception e)
		{
			System.out.println("not possible");
		}
	}
	
	public static void main(String[] args)
	{
		
	test();

}
}
