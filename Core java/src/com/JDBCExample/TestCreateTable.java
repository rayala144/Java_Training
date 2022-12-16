package com.JDBCExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestCreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		con = DBConnection.getDBConnection();
		
		try {
			st = con.createStatement();
			String sql = "create table employee(empID int, empName varchar(50), salary int)";
			st.execute(sql);
			System.out.println("Table created successfully");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
