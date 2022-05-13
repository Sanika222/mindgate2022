package com.mindgate.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";  
		String password="mindgate123";
		
		String driver="oracle.jdbc.OracleDriver";
		int resultCount=0;
		String sqlQuery="";
		
		Connection connection; 
		PreparedStatement preparedStatement;
		
		

		try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			sqlQuery="DELETE employee_details where employee_id=?";
			preparedStatement=connection.prepareStatement(sqlQuery);
			preparedStatement.setInt(1,3);

			resultCount=preparedStatement.executeUpdate();
			connection.close();
			if(resultCount>0)
				System.out.println("Record deleted successfully");
			else
				System.out.println("not deleted");
			
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			sqlQuery="UPDATE employee_details SET name=? where employee_id=7";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Sani");
//			
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			
//			if(resultCount>0)
//				System.out.println("Record updates successfully");
//			else
//				System.out.println("not updated");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			sqlQuery="INSERT INTO employee_details(name,salary)values(?,?)";
//			preparedStatement=connection.prepareStatement(sqlQuery);
//			preparedStatement.setString(1, "Sanikaaa");
//			preparedStatement.setDouble(2, 50000);
//			
//			
//			resultCount=preparedStatement.executeUpdate();
//			connection.close();
//			if(resultCount>0)
//				System.out.println("Record inserted successfully");
//			else
//				System.out.println("record not added");
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		
//		ResultSet resultSet;
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			statement=connection.createStatement();
//			sqlQuery="select * from employee_details";
//			resultSet=statement.executeQuery(sqlQuery);
//			
//			while(resultSet.next()) {
//				System.out.println(resultSet.getInt("employee_id"));
//				System.out.println(resultSet.getString("name"));
//				System.out.println(resultSet.getInt("salary"));
//				
//				
//			}
//			connection.close();
//					
//			
//			
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			statement=connection.createStatement();
//			sqlQuery="DELETE employee_details where employee_id=5";
//			
//			resultCount=statement.executeUpdate(sqlQuery);
//			connection.close();
//			if(resultCount>0)
//				System.out.println("Record deleted successfully");
//			else
//				System.out.println("not updated");
//			
//		
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
//		try {
//			Class.forName(driver);
//			connection=DriverManager.getConnection(url, user, password);
//			statement=connection.createStatement();
//			sqlQuery="UPDATE employee_details SET name='Sanika Manchekar' where employee_id=2";
//			
//			resultCount=statement.executeUpdate(sqlQuery);
//			connection.close();
//			
//			if(resultCount>0)
//				System.out.println("Record updates successfully");
//			else
//				System.out.println("not updated");
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		System.out.println("Insert example");
//		
//			try {
//				Class.forName(driver);
//				connection=DriverManager.getConnection(url, user, password);
//				statement=connection.createStatement();
//				sqlQuery="INSERT INTO employee_details(name,salary)values('amjad',3000)";
//				
//				resultCount=statement.executeUpdate(sqlQuery);
//				connection.close();
//				if(resultCount>0)
//					System.out.println("Record inserted successfully");
//				else
//					System.out.println("record not added");
//				
//			} catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	}}
			
			
			
		
		
		
		
			

			
		
	


