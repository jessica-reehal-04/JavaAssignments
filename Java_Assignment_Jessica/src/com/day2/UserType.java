package com.day2;

public class UserType 
{
	String name;
	
	UserType(String parameterVal)
	{
		name=parameterVal;
	}
	
	UserType()
	{
		this("Student");
	}

	public static void main(String[] args) 
	{
		UserType u1=new UserType("Faculty");
		UserType u2=new UserType();
		
		System.out.println(u1.name);
		System.out.println(u2.name);
		
	}

}
