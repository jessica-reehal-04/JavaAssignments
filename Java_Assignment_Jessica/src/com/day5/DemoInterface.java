package com.day5;

interface InterOne
{
	public static final int varOne = 0;
	int varTwo=100;
	
	void methodOne();
	void methodTwo();
}

class Example implements InterOne
{
	@Override
	public void methodOne() 
	{
		System.out.println("Value of varTwo: "+(InterOne.varTwo+10));
		System.out.println("Good Morning");
	}

	@Override
	public void methodTwo() 
	{
		System.out.println("Good Afternoon");
	}
	
}
public class DemoInterface
{
	public static void main(String[] args) {
		Example obj=new Example();
		obj.methodOne();
		obj.methodTwo();
	}
	
}
