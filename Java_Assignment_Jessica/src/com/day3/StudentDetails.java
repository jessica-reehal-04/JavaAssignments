package com.day3;

public class StudentDetails 
{
	private int studentId;
	private String studentName;
	private String residentialStatus;
	private int feesPerMonth;
	
	

	public StudentDetails(int studentId, String studentName, String residentialStatus, int feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.residentialStatus = residentialStatus;
		this.feesPerMonth = feesPerMonth;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public int getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(int feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	

	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", studentName=" + studentName + ", residentialStatus="
				+ residentialStatus + ", feesPerMonth=" + feesPerMonth + "]";
	}

	public static void main(String[] args) 
	{
		StudentDetails s=new StudentDetails(Integer.parseInt(args[0]),args[1],args[2],Integer.parseInt(args[3]));
		
		System.out.println(s);
		
	}

}
