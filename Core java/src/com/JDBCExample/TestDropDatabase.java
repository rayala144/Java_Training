package com.JDBCExample;

import java.sql.*;

public class TestDropDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		con = DBConnection.getDBConnection();
		try {
			st = con.createStatement();
			String sql = "drop database HCL";
			st.execute(sql);
			System.out.println("Successfully dropped HCL database!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
