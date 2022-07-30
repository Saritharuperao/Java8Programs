package com.createiq.BatchProcessing;


	import java.sql.*;  
	class FetchRecords{  
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		
	public static void main(String args[])throws Exception{  
	Class.forName("com.mysql.cj.jdbc.Driver ");  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/octavia","root","root");  
	con.setAutoCommit(false); 
	  
	Statement stmt=con.createStatement();  
	stmt.addBatch("insert into employeevalues(190,'abhi',40000)");  
	stmt.addBatch("insert intoevalues(191,'umesh',50000)");  
	  
	stmt.executeBatch();//executing the batch  
	  
	con.commit();  
	con.close();  
	}}  

