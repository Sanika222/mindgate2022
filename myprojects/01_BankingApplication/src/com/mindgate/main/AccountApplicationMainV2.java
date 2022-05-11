package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMainV2 {
	public static void main(String[] args) {
		Account account=new Account(101, "Sanikaa", 1000);
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
		
		result=account.deposit(500);
		if(result) {
			System.out.println("Successful");
			System.out.println("balance--" +account.getBalance());
	}
		else {
			System.out.println("Unsuccess");
			System.out.println("balance--" +account.getBalance());
		}
	
		
	}

}