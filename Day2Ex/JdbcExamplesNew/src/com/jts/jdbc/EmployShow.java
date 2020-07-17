package com.jts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class EmployShow {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("pwd");

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from Employ");
			while(rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("name"));
				System.out.println("Department  " +rs.getString("dept"));
				System.out.println("Designation  " +rs.getString("desig"));
				System.out.println("Basic  " +rs.getInt("basic"));
				System.out.println("-------------------------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
