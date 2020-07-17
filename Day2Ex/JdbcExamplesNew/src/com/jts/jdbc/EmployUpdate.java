package com.jts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		int empno, basic;
		String desig;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No    ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Designation   ");
		desig = sc.nextLine();
		System.out.println("Enter Salary    ");
		basic = Integer.parseInt(sc.nextLine());
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("pwd");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "UPDATE EMPLOY SET DESIG=?, BASIC=? WHERE EMPNO=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, desig);
			pst.setInt(2, basic);
			pst.setInt(3, empno);
			pst.executeUpdate();
			System.out.println("*** Record Updated ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
