package com.JDBCExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestInsertRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		con=DBConnection.getDBConnection();
		try {
			st = con.createStatement();
			String sql = "insert into employee values(101,'Akhil', 1200)";
			st.execute(sql);
			
			
			String sql1 = "insert into employee values(102, 'Nolan', 1400)";
			st.execute(sql1);
			
			String sql2 = "insert into employee values(103, 'Kiran', 1300)";
			st.execute(sql2);
			
			String sql3 = "insert into employee values(104, 'Rajamouli', 130000)";
			st.execute(sql3);
			
			
			System.out.println("Successfully inserted record ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
