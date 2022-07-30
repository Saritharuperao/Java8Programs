package com.createiq.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class Delete {

		public static void main(String[] args) {

	        Connection connection = null;
	        PreparedStatement ps = null;
	       // ResultSet rs = null;
	        String delete=" delete from employee where eid=?";
	        try {
	            List<Employee> employees = new ArrayList<>();
	            Driver driver = new Driver();
	            DriverManager.registerDriver(driver);
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
	            System.out.println(connection);
	            ps = connection.prepareStatement(delete);
	            Employee employee;
				ps.setInt(1, 100);
	            int rs=ps.executeUpdate();
	            System.out.println(rs);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
//	                Connection rs = null;
//					if (rs != null && ps != null && connection != null) {
	                   // rs.close();
	                    ps.close();
	                    connection.close();
	                }
	         
	        catch (SQLException e) {
	            	System.out.println(e.getSQLState());
	            	System.out.println(e.getMessage());
	                e.printStackTrace();
	            }
	        }
	  }
}