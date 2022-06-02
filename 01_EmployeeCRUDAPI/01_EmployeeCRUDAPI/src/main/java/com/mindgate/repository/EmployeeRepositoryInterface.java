package com.mindgate.repository;

import java.util.List;

import com.mindgate.pojo.Employee;




public interface EmployeeRepositoryInterface {
public boolean addNewEmployee(Employee employee);
	
	public boolean updateEmployee(Employee employee);
	
	public boolean deleteEmployee(int employeeId);
	
	public Employee getEmployeeByEmployeeId(int employeeId);
	
	public List<Employee> getAllEmployees();
}
