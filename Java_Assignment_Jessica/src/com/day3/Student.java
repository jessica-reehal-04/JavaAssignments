package com.day3;

public class Student 
{
	static int studentCount;
	int studentId;
	char studentType;
	String studentName;
	
	static
	{
		studentCount=10;
	}
	
	Student(char sType,String fname,String lname)
	{
		studentCount++;
		this.studentId=studentCount;
		this.studentType=sType;
		this.studentName=fname+" "+lname;
		
	}
	
	public static int getStudentCount()
	{
		return studentCount;
	}
	
	public static void main(String[] args) 
	{
		Student s1=new Student('D',"Bony","Thomas");
		System.out.println(Student.getStudentCount());
		
		Student s2=new Student('H',"Dinil","Bose");
		System.out.println(Student.getStudentCount());
		
	}

}
