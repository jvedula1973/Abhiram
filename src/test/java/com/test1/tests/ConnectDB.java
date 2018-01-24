package com.test1.tests;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	
	static Connection conn = null;
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		connectDB();
	}
	
	 public static void connectDB() throws ClassNotFoundException, SQLException
	  {
		
		  String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Northwind";
	      String user = "sa";
	      String pass = "prAsanna";

			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
								
				conn = DriverManager.getConnection(dbURL, user, pass);
			
		 
		      if (conn != null) {
		    	  System.out.println("Connection was successful!");
		          DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
		          System.out.println("Driver name: " + dm.getDriverName());
		          System.out.println("Driver version: " + dm.getDriverVersion());
		          System.out.println("Product name: " + dm.getDatabaseProductName());
		          System.out.println("Product version: " + dm.getDatabaseProductVersion());
		      }
			} 
	      catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				if(conn != null)
				{
					conn.close();
					
				}
			}
		  
	  }	

}
