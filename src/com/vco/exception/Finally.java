package com.vco.exception;

public class Finally {

	public static void main(String[] args) {
		int a[]=new int[2];
		System.out.println("out of try");
		try
		{
			System.out.println(a[3]);
		}
		finally
		{
			System.out.println("finally is always executed");
		}

	}

}
