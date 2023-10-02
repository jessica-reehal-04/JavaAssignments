package com.day5.courseregistration;

import com.day5.studentpack.Student;

public class DayScholar extends Student
{
	private String residentialAddress;
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Id: "+this.studentId);
		System.out.println("Student Type: "+this.studentType);
		System.out.println("Student Name: "+this.studentName);
	}



	public static void main(String[] args) 
	{
		DayScholar d=new DayScholar();
		d.setStudentId(1001);
		d.setStudentType('D');
		d.setStudentName("Dinil");
		
		d.getStudentDetails();
	}

}
