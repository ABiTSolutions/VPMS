package com.vpms.dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection con = null;

	public static Connection getConnection()
	{
		String DriverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
 	    String url = "jdbc:sqlserver://localhost:1433;databaseName=VPMS_DB";		
 	    String DBuser = "admin";
 	    String DBpassword = "admin";
 	    try {
			Class.forName(DriverName).newInstance();
			con = DriverManager.getConnection(url, DBuser, DBpassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
	   return con;
	}
 }
