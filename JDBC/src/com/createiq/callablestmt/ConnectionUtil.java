package com.createiq.callablestmt;


	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import com.mysql.cj.jdbc.CallableStatement;
	public class ConnectionUtil {

	
		private static Connection connection=null;
		private static Statement st=null;
		private static ResultSet rs=null;
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia", "root", "root");
			System.out.println(connection);
			
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
		}
		public static Connection getConnection() {
			return connection;
		}
		public static void closeConnection(Connection connection) {
			if(connection!=null ) {
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
		}
		
		public static void closeConnection(Connection connection,Statement st) {
			if(st!=null) {
				try {
					closeConnection(connection);
					st.close();
				}
				catch (SQLException e) {
					
				}
			}
			}
			public static void closeConnection(Connection connection, Statement st,ResultSet rs) {
				if(rs!=null) {
					
					try {
						closeConnection(connection,st);
						rs.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
					
			}
		}
		public static void main(String[] args) {
			
			System.out.println(getConnection());
		}
		

	}


