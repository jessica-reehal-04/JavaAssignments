package com.day2;

public class PassByValRef 
{
	public void passTheValueMethod(int sid)
	{
		sid=10;
		System.out.println(sid+" Inside method");
	}
	
	public void passTheReferenceMethod(Students s)
	{
		s.setStudentType('L');
	}
	public static void main(String[] args) 
	{
		PassByValRef val=new PassByValRef();
		int sid=5;
		val.passTheValueMethod(sid);
		
		System.out.println(sid+" Inside Main");
		
		Students s=new Students(1,'F');
		System.out.println(s);
		val.passTheReferenceMethod(s);
		
		System.out.println(s);
	}

}
