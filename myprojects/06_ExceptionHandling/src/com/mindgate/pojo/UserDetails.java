package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDetails {
	int userId;
	String name;
	int age;
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}
	public UserDetails(int userId, String name, int age) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void acceptUserDetails()
	{
		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id:");
		userId=scanner.nextInt();
		
		System.out.println("Enter name:");
		name=scanner.next();
		
		System.out.println("Enter age:");
		age=scanner.nextInt();
		}catch(InputMismatchException e){
			System.out.println(e.getMessage());
			System.out.println("Invalid input from user");
			System.out.println("Please enter valid values");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Details accepted");
			
		}
		
	}
	public void displayUserDetails()
	{
		System.out.println(userId);
		System.out.println(name);
		System.out.println(age);
	}
	


}
