package com.mindgate.main;

import java.util.SortedMap;
import java.util.TreeMap;

import com.mindgate.pojo.Employee;

public class TreeMapMain {
	public static void main(String[] args) {
		SortedMap<Integer,String> employeeMap =new TreeMap<Integer, String>();
		employeeMap.put(101,"sanika");
		employeeMap.put(102,"sanika");
		employeeMap.put(101,"sanika");
		employeeMap.put(104,"sanika");
		System.out.println(employeeMap);
	}

}
