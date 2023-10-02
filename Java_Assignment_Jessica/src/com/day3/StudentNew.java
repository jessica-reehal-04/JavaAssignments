package com.day3;

public class StudentNew 
{
	int studentId;
	char studentType;
	String studentName;
	
	public StudentNew(int id,char type,String fname,String lname)
	{
		this.studentId=id;
		this.studentType=type;
		this.studentName=fname+" "+lname;
	}
	
	public void setStudentName(String firstName,String lastName)
	{
		this.studentName=firstName+" "+lastName;
	}
	
	public String getStudentName()
	{
		return this.studentName;
	}

	public static void main(String[] args) 
	{
		StudentNew s=new StudentNew(1,'F',"Jessica","Reehal");
		
	    System.out.println(s.getStudentName());
	}
		

}
