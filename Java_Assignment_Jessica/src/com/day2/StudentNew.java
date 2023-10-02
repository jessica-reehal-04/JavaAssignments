package com.day2;

public class StudentNew 
{
	static int id=550;
	int studentId;
	char studentType;
	String studentName;
	
	StudentNew()
	{
		this.studentId=id;
		id++;
	}
	
	StudentNew(char sType,String fname,String lname)
	{
		super();
		this.studentId=id;
		this.studentType=sType;
		this.studentName=fname+" "+lname;
		id++;
	}
	
	public void displaydetails(StudentNew s)
	{
		System.out.println(s.studentId+" "+s.studentName+" "+s.studentType);
	}

	public static void main(String[] args) 
	{
		StudentNew s1=new StudentNew('D',"Bony","Thomas");
		s1.displaydetails(s1);
		
		StudentNew s2=new StudentNew('H',"Dinil","Bose");
		s2.displaydetails(s2);

	}

}
