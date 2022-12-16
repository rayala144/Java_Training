package com.JDBCExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestUpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		con=DBConnection.getDBConnection();
		try {
			st = con.createStatement();
			String sql = "update employee set salary=2000 where empID=102";
			st.execute(sql);
			System.out.println("Successfully updated 1 record");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
