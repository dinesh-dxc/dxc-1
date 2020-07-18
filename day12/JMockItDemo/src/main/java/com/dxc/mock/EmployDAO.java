package com.dxc.mock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String updateEmploy(int empno, String desig, int basic) throws SQLException {
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("UPDATE EMPLOY SET DESIG=?, BASIC=? WHERE EMPNO=?");
		pst.setString(1,desig);
		pst.setInt(2, basic);
		pst.setInt(3, empno);
		pst.executeUpdate();
		return "Record Updated...";
	}
	
	public String addEmploy(Employ employ) throws SQLException {
		String result = "Pending";
		if (employ.getEmpno() <= 0) {
			result = "Negative Nos Not Allowed...";
		} else if (employ.getName().length() <= 3) {
			result = "Name Min. 4 chars...";
		} else if (employ.getDept().length() <= 3) {
			result = "Dept Min. 4 chars...";
		} else if (employ.getDesig().length() <= 3) {
			result = "Desig Min. 4 chars...";
		} else if (employ.getBasic() <= 1000) {
			result = "Basic Must be greater than 1000";
		} else {
			String cmd = "INSERT INTO EMPLOY VALUES(?,?,?,?,?)";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, employ.getEmpno());
			pst.setString(2, employ.getName());
			pst.setString(3, employ.getDept());
			pst.setString(4, employ.getDesig());
			pst.setInt(5, employ.getBasic());
			pst.executeUpdate();
			result = "Employ Record Inserted...";
		}
		return result;
	}
	
	public Employ[] showAllEmploy() throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		Employ[] arrEmploy = new Employ[cnt];
		cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		rs = pst.executeQuery();
		Employ employ = null;
		int i=0;
		while (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic")); 
			arrEmploy[i]=employ;
			i++;
		}
		return arrEmploy;
	}
	public Employ searchEmploy(int empno) {
		connection=ConnectionHelper.getConnection();
		Employ employ = null;
		String cmd = "select * from Employ where Empno=?";
		try {
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				employ = new Employ();
				employ.setEmpno(rs.getInt("empno"));
				employ.setName(rs.getString("name"));
				employ.setDept(rs.getString("dept"));
				employ.setDesig(rs.getString("desig"));
				employ.setBasic(rs.getInt("basic"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employ;
	}
}
