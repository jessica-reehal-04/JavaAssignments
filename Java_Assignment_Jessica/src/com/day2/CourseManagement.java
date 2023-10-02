package com.day2;

class Student
{
	private int studentId;
	private char studentType;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	
}

public class CourseManagement 
{
	public static void main(String[] args)
	{
		Student s=new Student();
		
		s.setStudentId(1);
		s.setStudentType('F');
		
		System.out.println("Student Id: "+s.getStudentId()+"  "+"Student Type: "+s.getStudentType());
		
		
	}

}
