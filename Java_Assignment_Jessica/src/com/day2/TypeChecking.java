package com.day2;

public class TypeChecking 
{
	public static void main(String[] args) {
		int val=90;
		byte bVal=(byte)val;
		
		byte max=127;
		byte min=-127;
		byte sum=(byte) (max+min);
		
		System.out.println("Sum= "+sum);
	}

}
