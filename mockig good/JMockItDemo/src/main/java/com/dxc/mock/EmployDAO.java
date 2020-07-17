package com.dxc.mock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
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
