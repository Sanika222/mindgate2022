package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountApplicationV3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
		
	int accountNumber;
	String name;
	double balance;
	String continueChoice;
	
	
	System.out.println("Enter account number");
	accountNumber=scanner.nextInt();
	
	System.out.println("Enter name");
	name=scanner.next();
	
	System.out.println("Enter balance");
	balance=scanner.nextDouble();
	
	Account account=new Account(accountNumber, name, balance);
	account.setAccountNumber(accountNumber);
	account.setName(name);
	account.setBalance(balance);
	
	
	System.out.println("Account openes successfully");
	do {
	System.out.println("Menu");
	System.out.println("Withdraw");
	System.out.println("Deposit");
	System.out.println("Check balance");
	
	
	System.out.println("Enter your choice");
	int choice=scanner.nextInt();

	if(choice==1)
	{
		System.out.println("Eter amount  ");
		boolean result=account.withdraw(200);
		if(result)
		{
			System.out.println("Transaction successful");
			System.out.println("Balance:: "+account.getBalance());
		}
		else
		{
			System.out.println("Transaction failed");
			System.out.println("Balance::"+account.getBalance());
		}
	
	}
	else if(choice==2)
	{
		boolean result=account.deposit(500);
		if(result) {
			System.out.println("Successful");
			System.out.println("balance--" +account.getBalance());
	}
		else {
			System.out.println("Unsuccess");
			System.out.println("balance--" +account.getBalance());
		}
	
	}
	else if(choice==3)
	{
		System.out.println(account.getBalance());
	}
	
	System.out.println("Do you want to continue <yes>/<no>");
	
	
	continueChoice=scanner.next();
}
	while(continueChoice.equals("yes"));

	System.out.println("Thankyou");
	
	
	
	
}
}
