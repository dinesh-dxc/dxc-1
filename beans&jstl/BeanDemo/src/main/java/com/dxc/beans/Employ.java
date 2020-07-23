package com.dxc.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employ {

	private int empno;
	private String name;
	private String dept;
	private String desig;
	private int basic;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	
	public ResultSet searchEmploy() throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "SELECT * FROM EMPLOY WHERE EMPNO=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		return rs;
	}
	public String addEmploy() throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "INSERT INTO EMPLOY VALUES(?,?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.setString(2, name);
		pst.setString(3, dept);
		pst.setString(4, desig);
		pst.setInt(5, basic);
		pst.executeUpdate();
		return "Record Inserted...";
	}
}
