package com.JDBCExample;

import java.sql.Connection;
import java.sql.Statement;

public class TestDeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement st = null;
		
		con=DBConnection.getDBConnection();
		try {
			st = con.createStatement();
			String sql = "delete from employee where empid=102";
			st.execute(sql);
			System.out.println("Successfully deleted 1 record!");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
