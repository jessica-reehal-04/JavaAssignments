package com.day3;

public class JavaDoc 
{
	public void display(String userName)
	{
		System.out.println(userName.length());
		
		System.out.println("Hi "+userName);
		
		System.out.println(userName.toLowerCase());
	}
	public static void main(String[] args)
	{
		JavaDoc jd=new JavaDoc();
		
		jd.display("Jessica");
		
	}

}
