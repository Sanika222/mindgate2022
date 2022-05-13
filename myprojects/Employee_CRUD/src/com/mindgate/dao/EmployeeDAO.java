package com.mindgate.dao;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class EmployeeDAO {
	Set<Employee> empSet =new HashSet<Employee>();
	
	public boolean addNewEmployee(Employee employee) {
		return empSet.add(employee);
		
	}

}
