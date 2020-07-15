package com.jdbc.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployDelete {
	public static void main(String[] args) {
		int empno;
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Scanner sc = new Scanner(System.in);
		String driver=rb.getString("driver");
		String url=rb.getString("con");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		System.out.println("Enter Employ No  ");
		empno=sc.nextInt();
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "DELETE FROM EMPLOY WHERE Empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			System.out.println("Record Deleted...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
