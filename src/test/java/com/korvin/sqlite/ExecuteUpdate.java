package com.korvin.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdate {
	 public static void main( String args[] )
	  {
	    Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:example.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql;
	     // sql = "drop table blog" ;
		 // stmt.executeUpdate(sql);
	      
	      sql = "CREATE TABLE `blog` (\r\n" + 
	      		"  `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,\r\n" + 
	      		"  `title` varchar(45) ,\r\n" + 
	      		"  `content` varchar(4000) ,\r\n" + 
	      		"  `description` varchar(100) ,\r\n" + 
	      		"  `create_time` TEXT(32) ,\r\n" + 
	      		"  `update_time` TEXT(32)\r\n" + 
	      		")";
	      stmt.executeUpdate(sql);

	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	  }
}
