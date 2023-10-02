package com.day4;

class Student3
{
	private int studentId;
	private char studentType;
	private String studentName;
	final private int semFees=12000;
	private int feesPerMonth;
	
	public Student3(int studentId, char studentType, String studentName, int feesPerMonth) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.feesPerMonth = feesPerMonth;
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
	public int getSemFees() {
		return semFees;
	}
	
	public int getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(int feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void calculateFees()
	{
		System.out.println(this.getFeesPerMonth()/6.0);
	}
	public final void displayDetail()
	{
		System.out.println(this.getStudentId()+" "+this.getStudentName()+" "+this.getStudentType()+" "+this.getFeesPerMonth()+" "+this.getSemFees());
	}
	
}

public final class DayScholar1 extends Student3
{

	private String address;
	
	public DayScholar1(int studentId, char studentType, String studentName, int feesPerMonth,String address) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String []args)
	{
		DayScholar1 d=new DayScholar1(1,'L',"Jessica",80000,"Ludhiana");
		
		d.calculateFees();
	}
	
	
}
