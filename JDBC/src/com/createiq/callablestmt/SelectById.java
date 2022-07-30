package com.createiq.callablestmt;


	
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class SelectById {
		public static void main(String[] args) {
			
			Connection connection=null;
			CallableStatement cs=null;
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
				 cs=connection.prepareCall("{call employee_select_by_id(?)}"); 
			
			cs.setInt(1, 114);
		//	int result=cs.getInt(1);
			//System.out.println(result);
			ResultSet rs=cs.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println(rs.getString(4));
			}
			
			
			
			} catch (SQLException e) {
			
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
