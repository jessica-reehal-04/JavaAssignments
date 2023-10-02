package com.day2;

public class Students 
{
	private int studentId;
	private char studentType;
	
	public Students()
	{
		this.studentId=10;
		this.studentType='F';
	}
	
	public Students(int studentId, char studentType) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
	}

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


	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentType=" + studentType + "]";
	}

	public static void main(String[] args) 
	{
		Students s=new Students();
		
		System.out.println("Student Id: "+s.getStudentId()+"  "+"Student Type: "+s.getStudentType());

	}

}
