package com.JDBCExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestShowAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		con=DBConnection.getDBConnection();
		try {
			st = con.createStatement();
			String sql = "select * from employee";
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt("empID");
				String name = rs.getString("empName");
				int sal = rs.getInt("salary");
				System.out.println("Employee ID: "+id+", Employee name: "+name+", Salary: "+sal);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
