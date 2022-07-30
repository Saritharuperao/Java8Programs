package com.createiq.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Insert {
	public static void main(String[] args) {
		Employee employee = new Employee(102, "saritha",5444.00,"saritha@gmail.com");
		 Connection connection = null;
	        PreparedStatement ps = null;
		String insertemployee= "insert into employee values(?,?,?,?)";
		try
		{
			Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		  
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
		System.out.println(connection);
		ps = connection.prepareStatement(insertemployee);
		 ps.setInt(1, employee.getId());
		 ps.setString(2, employee.getName());
		 ps.setDouble(3, employee.getSalary());
		 ps.setString(4, employee.getEmail());
		 int row = ps.executeUpdate();
         System.out.println(" inserted " + row + " row successfully....!");

     } 
		
		catch (SQLException e) {
     }
		finally
		{
            try {
//                rs.close();
                ps.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}

			
		
		 



