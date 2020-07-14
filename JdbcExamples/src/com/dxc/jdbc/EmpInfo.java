package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EmpInfo {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		try {
			Class.forName(rb.getString("driver"));
			Connection con =DriverManager.getConnection(rb.getString("con"),
					rb.getString("user"), rb.getString("password"));
			System.out.println("Connected...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
