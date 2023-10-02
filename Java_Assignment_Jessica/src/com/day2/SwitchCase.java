package com.day2;

public class SwitchCase {

	public static void main(String[] args) 
	{
		char grade='B';
		
		switch(grade) {
		
		case 'A':
			System.out.println("Range: 80-100");
			break;
		case 'B':
			System.out.println("Range: 73-79");
			break;
		case 'C':
			System.out.println("Range: 65-72");
			break;
		case 'D':
			System.out.println("Range: 55-64");
			break;
		case 'E':
			System.out.println("Range: <55");
			break;
		default:
			System.out.println("Grade do not exist");
		
		}
		

	}

}
