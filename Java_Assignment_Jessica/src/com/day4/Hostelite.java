package com.day4;

class Student
{
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	public Student(int id,char type,String fname,String lname,double fees)
	{
		this.studentId=id;
		this.studentType=type;
		this.studentName=fname+" "+lname;
		this.feesPerMonth=fees;
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

	public double getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
}

public class Hostelite extends Student
{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostelite(int id, char type, String fname, String lname,double fees,String hostelName,int roomNo) {
		super(id, type, fname, lname,fees);
		this.hostelName=hostelName;
		this.roomNumber=roomNo;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return "Hostelite [hostelName=" + hostelName + ", roomNumber=" + roomNumber + ", getStudentId()="
				+ getStudentId() + ", getStudentType()=" + getStudentType() + ", getStudentName()=" + getStudentName()
				+ ", getFeesPerMonth()=" + getFeesPerMonth() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String []args)
	{
		Hostelite h=new Hostelite(1,'L',"Jessica","Reehal",80000,"LC",103);
		
		System.out.println(h);
	}
	

}
