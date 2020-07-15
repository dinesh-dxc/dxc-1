package com.jdbc.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployUpdate {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Scanner sc = new Scanner(System.in);
		String driver=rb.getString("driver");
		String url=rb.getString("con");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		int empno,basic;
		String desig;
		System.out.println("Enter Employ No  ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Designation  ");
		desig=sc.nextLine();
		System.out.println("Enter Salary   ");
		basic=Integer.parseInt(sc.nextLine());
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "UPDATE EMPLOY SET Desig=?, Basic=? WHERE "
					+ " Empno=?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, desig);
			pst.setInt(2, basic);
			pst.setInt(3, empno);
			pst.executeUpdate();
			System.out.println("Record Updated...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
