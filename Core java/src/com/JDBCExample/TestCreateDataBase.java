package com.JDBCExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestCreateDataBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		con = DBConnection.getDBConnection();
		
		try {
			st = con.createStatement();
			String sql = "Create database HCL";
			st.execute(sql);
			System.out.println("Database is created successfully!!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
