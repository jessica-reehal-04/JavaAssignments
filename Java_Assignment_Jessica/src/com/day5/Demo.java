package com.day5;

class Travel
{
	private char modeOfTravel;
	private int noOfTickets;
	private double amount;
	
	public char getModeOfTravel() {
		return modeOfTravel;
	}
	public void setModeOfTravel(char modeOfTravel) {
		this.modeOfTravel = modeOfTravel;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}

public class Demo 
{
	public static void main(String[] args) 
	{
		Travel t=new Travel();
		t.setModeOfTravel('F');
		t.setNoOfTickets(3);
		
		if(t.getModeOfTravel()=='F')
			t.setAmount(500);
		else if(t.getModeOfTravel()=='T')
			t.setAmount(100);
		else
			t.setAmount(50);
		
		double totalServiceCharge=t.getAmount()*t.getNoOfTickets();
		System.out.println(totalServiceCharge);

	}

}
