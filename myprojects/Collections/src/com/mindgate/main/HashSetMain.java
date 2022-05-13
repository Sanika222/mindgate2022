package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetMain {
	public static void main(String[] args) {
		Set<String> nameSet=new HashSet<String>();
		
		nameSet.add("Shradha");
		nameSet.add("Sanika");
		nameSet.add("prachi");
		nameSet.add("Sanika");
		nameSet.add("amjad");
		nameSet.add("yogesh");
		
		System.out.println(nameSet);
		
		System.out.println("-" .repeat(50));
		
		Employee employee1 =new Employee(101,"sanika",1000);
		System.out.println(employee1.hashCode());
		Employee employee2 =new Employee(101,"sanika",1000);
		System.out.println(employee2.hashCode());
		Employee employee3 =new Employee(103,"sanika",1000);
		System.out.println(employee3.hashCode());
		Employee employee4 =new Employee(104,"sanika",1000);
		System.out.println(employee4.hashCode());
		
		Set<Employee> employeeSet =new HashSet<Employee>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		
		for(Employee employee:employeeSet)
		{
			System.out.println(employee);
		}
				
	}

}
