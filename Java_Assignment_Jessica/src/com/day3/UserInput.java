package com.day3;

public class UserInput {

	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int iterations=Integer.parseInt(args[1]);
		
		for(int i=1;i<=iterations;i++)
		{
			System.out.println(number+" X "+i+" = "+number*i);
		}
	}

}
