package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;

public class EmployeeMain {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	
	 int employeeId;
	 String name;
	 double salary;
	 
	 System.out.println("enter employeId");
	 employeeId=scanner.nextInt();
	 System.out.println("Enter name");
	 name=scanner.next();
	 System.out.println("Enter salary");
	 salary=scanner.nextDouble();
	 
	 Employee employee =new Employee();
	 employee.setEmployeeId(employeeId);
	 employee.setName(name);
	 employee.setSalary(salary);
	 
	 System.out.println(employee.getName());
	 System.out.println(employee.getSalary());
	 System.out.println("-" .repeat(50));
	 
	
	 
	 
	 
}
}
