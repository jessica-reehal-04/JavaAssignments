package com.day1;

public class Operators 
{
	public static void main(String[] args) {
		
		int a=5;
		int b=4;
		
		System.out.println(a%b); //Modulus Operator
		
		String s1="Jessica";
		String s2="Reehal";
		
		System.out.println(s1+" "+s2);  //Concatenation Operator
		
		String s3="abc";
		String s4="abc";
		
		if(s3==s4)  //Equality Operator
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		boolean b1=true;
		boolean b2=false;
		
		if(b1 || b2)  //OR Operator
			System.out.println("Logical OR True");
		else 
			System.out.println("Logical OR False");
		
		if(b1 && b2)  //AND Operator
			System.out.println("Logical AND True");
		else 
			System.out.println("Logical AND False");
		
	}

}
