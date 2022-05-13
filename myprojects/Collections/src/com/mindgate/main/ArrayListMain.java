package com.mindgate.main;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.ArrayListDemo;
import com.mindgate.pojo.Employee;

public class ArrayListMain {
	public static void main(String[] args) {
		
	ArrayListDemo arrayListDemo= new ArrayListDemo();
	List<String> nameList =new ArrayList<String>();
	nameList.add("Sanika");
	nameList.add("Sanika");
	nameList.add("Sanika");
	arrayListDemo.setArrayListId(101);
	arrayListDemo.setNameList(nameList);
	System.out.println(arrayListDemo);
	System.out.println("-" .repeat(50));
	List<Integer> numberList =new ArrayList<Integer>();
	numberList.add(101);
	numberList.add(102);
	numberList.add(101);
	numberList.add(104);
	numberList.add(101);
	System.out.println(numberList);
	
	Employee employee4=new Employee(101,"sanika",1000);
	Employee employee1=new Employee(102,"sanika",1000);
	Employee employee2=new Employee(101,"sanika",1000);
	Employee employee3=new Employee(104,"sanika",1000);
	
	List<Employee> employeeList=new ArrayList<Employee>();
	employeeList.add(employee1);
	employeeList.add(employee2);
	employeeList.add(employee4);
	employeeList.add(employee2);
	System.out.println(employeeList);
	
	System.out.println("-".repeat(50));
	
	for(Employee employee:employeeList)
	{
		System.out.println(employee);
	}
	
	
	
	}

}
