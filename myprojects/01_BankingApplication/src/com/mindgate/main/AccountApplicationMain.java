package com.mindgate.main;

import com.mindgate.pojo.Account;

public class AccountApplicationMain {
	public static void main(String[] args) {
		Account account=new Account(101, "sanika", 1000);
		System.out.println(account.getAccountNumber());
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		
		Account account2 =new Account();
		account2.setAccountNumber(102);
		account2.setName("sani");
		account2.setBalance(2000);
		
		System.out.println(account2.getAccountNumber());
		System.out.println(account2.getName());
		System.out.println(account2.getBalance());
		
		
	}
	
	
	
	
	
	
	}


