package com.jts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class EmpShow {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driver=rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("pwd");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, pwd);
			String cmd = "SELECT * FROM EMP";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(cmd);
			while(rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("ename"));
				System.out.println("Job  " +rs.getString("job"));
				System.out.println("Mgr   " +rs.getInt("mgr"));
				System.out.println("Salary  " +rs.getInt("sal"));
				System.out.println("---------------------------------");
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
