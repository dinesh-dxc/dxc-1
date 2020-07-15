package com.jdbc.day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class EmployInsert {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		Scanner sc = new Scanner(System.in);
		String driver=rb.getString("driver");
		String url=rb.getString("con");
		String user=rb.getString("user");
		String pwd=rb.getString("password");
		int empno,basic;
		String name,dept,desig;
		System.out.println("Enter Employ No  ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name  ");
		name=sc.nextLine();
		System.out.println("Enter Department  ");
		dept=sc.nextLine();
		System.out.println("Enter Designation  ");
		desig=sc.nextLine();
		System.out.println("Enter Salary   ");
		basic=Integer.parseInt(sc.nextLine());
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "INSERT INTO EMPLOY(Empno, Name, Dept, Desig, Basic) " + 
					"			Values(?, ?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, dept);
			pst.setString(4, desig);
			pst.setInt(5, basic);
			pst.executeUpdate();
			System.out.println("Record Inserted...");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
