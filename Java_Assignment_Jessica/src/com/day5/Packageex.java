package com.day5;

class Student
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
	}

}

public class Packageex 
{
	
	public static void main(String[] args) 
	{
		Student s =new Student();
		s.setStudentId(1);
		s.setStudentName("Jessica");
		s.setStudentType('L');
		s.getStudentDetails();
	}

}
