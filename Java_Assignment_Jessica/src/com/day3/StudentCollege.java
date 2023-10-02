package com.day3;

public class StudentCollege 
{
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth;
	
	public StudentCollege(int id,char type,String fname,String lname)
	{
		this.studentId=id;
		this.studentType=type;
		this.studentName=fname+" "+lname;
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

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void calculateFees(double semesterFees)
	{
		this.feesPerMonth=semesterFees/6.0;
	}
	
	public void calculateFees(double semesterFees,double hostelFees)
	{
		this.feesPerMonth=semesterFees/6.0;
		this.feesPerMonth=this.feesPerMonth+hostelFees;
	}
	
	public static void main(String []args)
	{
		StudentCollege s=new StudentCollege(1,'F',"Jessica","Reehal");
		
		s.setResidentialStatus("Day Scholar");
		
		if(s.getResidentialStatus()=="Day Scholar")
		{
			s.calculateFees(56000);
		}
		else
		{
			s.calculateFees(56000,100000);
		}
		
		System.out.println(s.getFeesPerMonth());
		
	}
	
	
}
