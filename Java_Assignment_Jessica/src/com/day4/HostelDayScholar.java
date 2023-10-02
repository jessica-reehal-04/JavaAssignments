package com.day4;

class Student1
{
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	public Student1(int id,char type,String fname,String lname,double fees)
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
	
	public void displayStudentDetails()
	{
		System.out.println(this.getStudentId()+" "+this.getStudentName()+" "+this.getStudentType()+" "+this.getFeesPerMonth());
	}
	
}


class Hostel extends Student1
{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostel(int id, char type, String fname, String lname,double fees,String hostelName,int roomNo) {
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
	
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println(this.getHostelName()+" "+this.getRoomNumber());
	}



}

class DayScholar extends Student1
{
	private String residentialAddress;
	
	public DayScholar(int id, char type, String fname, String lname, double fees,String address) {
		super(id, type, fname, lname, fees);
		this.residentialAddress=address;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void displayStudentDetails()
	{
		super.displayStudentDetails();
		System.out.println(this.getResidentialAddress());
	}
}


public class HostelDayScholar {

	public static void main(String[] args) 
	{
		if(args[0]=="Hostelite")
		{
			Hostel h=new Hostel(1,'L',"Jessica","Reehal",80000,"LC",103);
			h.displayStudentDetails();
		}
		else
		{
			DayScholar d=new DayScholar(1,'L',"Jessica","Reehal",80000,"Ludhiana");
			d.displayStudentDetails();
		}

	}

}
