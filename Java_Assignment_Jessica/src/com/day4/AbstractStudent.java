package com.day4;

abstract class Student5
{
	private int studentId;
	private char studentType;
	private String studentName;
	private double feesPerMonth;
	
	public Student5(int id,char type,String fname,String lname,double fees)
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
	
	abstract void calculateFees(double semFees);
	
}


class Hostel5 extends Student5
{
	
	private String hostelName;
	private int roomNumber;
	
	public Hostel5(int id, char type, String fname, String lname,double fees,String hostelName,int roomNo) {
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

	@Override
	void calculateFees(double semFees) 
	{
		super.setFeesPerMonth(semFees/6.0);
	}
	
	


}

class DayScholar5 extends Student5
{
	private String residentialAddress;
	
	public DayScholar5(int id, char type, String fname, String lname, double fees,String address) {
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

	@Override
	void calculateFees(double semFees) 
	{
		super.setFeesPerMonth((semFees/6.0)+1200);
	}
}


public class AbstractStudent {

	public static void main(String[] args) 
	{
		if(args[0]=="Hostelite")
		{
			Hostel5 h=new Hostel5(1,'L',"Jessica","Reehal",80000,"LC",103);
		    h.calculateFees(40000);
		}
		else
		{
			DayScholar5 d=new DayScholar5(1,'L',"Jessica","Reehal",80000,"Ludhiana");
			d.calculateFees(40000);;
		}

	}

}
