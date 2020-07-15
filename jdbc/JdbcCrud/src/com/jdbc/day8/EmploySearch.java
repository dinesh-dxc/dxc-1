package com.jdbc.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno=sc.nextInt();
		String driver=rb.getString("driver");
		String url=rb.getString("con");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,user,pwd);
			String cmd = "SELECT * FROM EMP WHERE EMPNO=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Name  " +rs.getString("ename"));
				System.out.println("Job  " +rs.getString("job"));
				System.out.println("Sal  " +rs.getString("sal"));
			} else {
				System.out.println("Invalid Employ No...");
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
