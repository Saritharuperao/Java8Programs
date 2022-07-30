package com.createiq.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Update {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
			statement = connection.createStatement();
			String sql = "update employee set ename = 'priya' WHERE eid =102";
			int result = statement.executeUpdate(sql);
			System.out.println(result);
//
//		        rs = statement.executeQuery("select * from employee");
//		         while(rs.next())
//		            //Display values
//		            System.out.println( rs.getInt("id"));
//		            System.out.println( rs.getString(2));
//		            System.out.println(rs.getDouble(3));
//		            System.out.println( rs.getString(4));
//		         
			// rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
				connection.close();

			} catch (SQLException e) {
				e.printStackTrace();

			}
		}
	}

}
