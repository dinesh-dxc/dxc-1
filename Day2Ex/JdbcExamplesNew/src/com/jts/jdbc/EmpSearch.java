package com.jts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmpSearch {
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
			String cmd = "SELECT * FROM EMP WHERE EMPNO=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("ename"));
				System.out.println("Job  " +rs.getString("job"));
				System.out.println("Mgr   " +rs.getInt("mgr"));
				System.out.println("Salary  " +rs.getInt("sal"));
				System.out.println("---------------------------------");
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
