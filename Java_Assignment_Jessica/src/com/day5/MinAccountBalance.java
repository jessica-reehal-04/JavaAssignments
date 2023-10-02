package com.day5;

class Account
{
	private int accAmount;
	private int accNo;
	private String custName;
	public int getAccAmount() {
		return accAmount;
	}
	public void setAccAmount(int accAmount) {
		this.accAmount = accAmount;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
}
public class MinAccountBalance {

	public static void main(String[] args)
	{
		Account acc=new Account();
		acc.setAccAmount(5000);
		
		if(acc.getAccAmount()<500)
			System.out.println("The balance is below minimum value");
		else
			System.out.println("Account Balance: "+acc.getAccAmount());

	}

}
