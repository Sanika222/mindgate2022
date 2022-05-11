package com.mindgate.main;

import com.mindgate.pojo.Current;

public class AccountApplicationV6 {
	public static void main(String[] args) {
		Current current=new Current(101, "sanika", 10000,5000);
		System.out.println("|Withdraw : 5000");
		current.withdraw(5000);
		System.out.println(current);
		
		System.out.println();
		System.out.println("Withdraw:20000");
		current.withdraw(20000);
		System.out.println(current);
		
		

		
	}
	
	
}
