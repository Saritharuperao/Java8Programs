

	

package com.createiq.callablestmt;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementDemo2 {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		
		Connection connection=null;
		CallableStatement cs=null;
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
			 cs=connection.prepareCall("{call employee_update_procedure(?,?,?)}"); 
		
		cs.setInt(1, 102);
		cs.setString(2, "priya");
		cs.setDouble(3, 67000.00);
		cs.execute();
		//cs.registerOutParameter(3, Types.DECIMAL);
		
		//System.out.println(cs.getString(2));
		System.out.println(cs.getDouble(3));
		
	}
	 catch (SQLException e) {
		
		e.printStackTrace();
	}
	finally {
		if(connection!=null && cs!=null ) {
			
			try {
				cs.close();
				connection.close();
			} catch (SQLException e) {
			
				
				e.printStackTrace();
			}
			
		}

}
	
	}
}