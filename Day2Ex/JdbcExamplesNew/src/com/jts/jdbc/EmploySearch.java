package com.jts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("pwd");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "SELECT * FROM EMPLOY WHERE EMPNO=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("name"));
				System.out.println("Department  " +rs.getString("dept"));
				System.out.println("Designation  " +rs.getString("desig"));
				System.out.println("Basic   " +rs.getInt("basic"));
				System.out.println("-----------------------------------");
			} else {
				System.out.println("*** Record Not Found ***");
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
