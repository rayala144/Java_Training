package com.JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;


/* Driver name : com.mysql.jdbc.Driver
 * URL		   : jdbc:mysql://localhost
 * 
*/
public class DBConnection {
	public static Connection getDBConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hcl", "root", "root"); // path, username, password
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
