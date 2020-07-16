package com.dxc.maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployShow {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url=rb.getString("url");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "SELECT * FROM EMP";
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Job   " +rs.getString("job"));
				System.out.println("Salary  " +rs.getInt("sal"));
				System.out.println("Comm  " +rs.getInt("comm"));
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
