package com.day5;

public class Strings 
{
	public String booking(String x,String nnn,String zzzz)
	{
		return 115+x+nnn+zzzz;
	}
	public static void main(String[] args) 
	{
		Strings s=new Strings();
		
		System.out.println(s.booking("F","102","0001"));
		
		System.out.println(s.booking("T","202","0002"));
		
		System.out.println(s.booking("B","304","0003"));
	}

}
