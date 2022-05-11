package com.mindgate.pojo;

public class Savings extends Account{
	private boolean isSalary;
	public Savings() {
		System.out.println("Default construcyor of savings");
		
	}
	
	
	public Savings(int accountNumber, String name, double balance, boolean isSalary) {
		super(accountNumber, name, balance);
		this.isSalary = isSalary;
		System.out.println("Overloaded const of savings");
	
	}
	
	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			if(isSalary && amount <=getBalance()) {
				setBalance(getBalance()-amount);
				return true;
			}
			if(isSalary ==false && getBalance()-amount>=1500)
			{
				setBalance(getBalance()-amount);
				return true;
			}
		}
		return super.withdraw(amount);
	}
	
	@Override
	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			setBalance(getBalance()+amount);
			return false;
		}
		return super.deposit(amount);
	}


	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}


	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
