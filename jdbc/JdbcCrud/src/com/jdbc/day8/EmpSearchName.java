package com.jdbc.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmpSearchName {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name   ");
		name = sc.nextLine();
		String driver=rb.getString("driver");
		String url=rb.getString("con");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "SELECT * FROM EMP WHERE ENAME=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Job   " +rs.getString("job"));
				System.out.println("Salary  " +rs.getInt("sal"));
				System.out.println("Comm  " +rs.getInt("comm"));
			} else {
				System.out.println("Record Not Found...");
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
