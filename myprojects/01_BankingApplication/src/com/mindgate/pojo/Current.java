package com.mindgate.pojo;

public class Current extends Account{
	private double overdraftBalance;
	public Current() {
		// TODO Auto-generated constructor stub
	}
	public Current(int accountNumber, String name, double balance, double overdraftBalance) {
		super(accountNumber, name, balance);
		this.overdraftBalance = overdraftBalance;
		System.out.println("Overloaded constructor of Current");
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(amount>0)
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
			if(amount>=getBalance())
			{
				setBalance(amount-getBalance());
				setOverdraftBalance(getOverdraftBalance()-getBalance());
				
				
				
		
		}
		return false;
	}
	
	@Override
	public boolean deposit(double amount) {
		return false;
	}
	
	public double getOverdraftBalance() {
		return overdraftBalance;
	}
	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}
	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
