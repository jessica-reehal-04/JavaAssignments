package com.day4;

class Student2
{
	private int studentId;
	private char studentType;
	private String studentName;
	
	
	public Student2(int studentId, char studentType, String studentName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
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
	
	
}

class PostGradStudent extends Student2
{
	private int postCourseId;
	private String postCourseName;
	private int postCourseFees;
	
	public PostGradStudent(int postCourseId, String postCourseName, int postCourseFees,int sid,char sType,String sName) {
		super(sid,sType,sName);
		this.postCourseId = postCourseId;
		this.postCourseName = postCourseName;
		this.postCourseFees = postCourseFees;
	}

	public int getPostCourseId() {
		return postCourseId;
	}

	public void setPostCourseId(int postCourseId) {
		this.postCourseId = postCourseId;
	}

	public String getPostCourseName() {
		return postCourseName;
	}

	public void setPostCourseName(String postCourseName) {
		this.postCourseName = postCourseName;
	}

	public int getPostCourseFees() {
		return postCourseFees;
	}

	public void setPostCourseFees(int postCourseFees) {
		this.postCourseFees = postCourseFees;
	}
	
	
	
}

class Scholar extends PostGradStudent
{

	private String residentialAddress;
	
	public Scholar(int postCourseId, String postCourseName, int postCourseFees, int sid, char sType, String sName,String address) {
		super(postCourseId, postCourseName, postCourseFees, sid, sType, sName);
		this.residentialAddress=address;
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void calculateFees()
	{
		System.out.println(this.getPostCourseFees()/6);
	}
}
public class Main {

	public static void main(String[] args) 
	{
		Scholar d=new Scholar(5,"OOP",16000,1001,'D',"Manu","NO 32/3 Vijaynagar");
		
		d.calculateFees();

	}

}
