package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.dao.EmployeeDAO;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		int empId;
		String name;
		double salary;
		int choice;
		String continueChoice;
		Employee emp;
		
		EmployeeDAO employeeDAO=new EmployeeDAO();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("Enter id");
			empId=scanner.nextInt();
			System.out.println("Enter name");
			name=scanner.next();
			System.out.println("Enter salary");
			salary=scanner.nextDouble();
			emp=new Employee(empId,name,salary);
			boolean result=employeeDAO.addNewEmployee(emp);
			if(result)
			{
				System.out.println("Added successfully");
			}
			else
				{
				System.out.println("Employee added failed");
				}
		}
		}
		
		
		
	}

}
