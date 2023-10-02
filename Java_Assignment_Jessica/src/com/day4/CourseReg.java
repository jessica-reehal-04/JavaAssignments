package com.day4;

class StudentC
{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	public StudentC(int id)
	{
		this.studentId=id;
	}

	public StudentC(int studentId, char studentType, String studentName, int semesterFees) {
		this(studentId);
		this.studentType = studentType;
		this.studentName = studentName;
		this.semesterFees = semesterFees;
		
	}
	
	void displayDetails()
	{
		System.out.println(studentId);
		System.out.println(studentType);
		System.out.println(studentName);
		System.out.println(semesterFees);
	}
	
	
}

class DScholar extends StudentC
{
	private String address;
	
	public DScholar(int studentId, char studentType, String studentName, int semesterFees,String address) {
		super(studentId, studentType, studentName, semesterFees);
		this.address=address;
	}
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println(address);
	}

	
}

public class CourseReg {

	public static void main(String[] args) 
	{
		DScholar ds=new DScholar(1001,'D',"Eugene",12000,"No 32/68 Vijaynagar");
		ds.displayDetails();

	}

}
