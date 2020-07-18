package com.dxc.mock;

import java.sql.SQLException;

public class EmployFactory {
	
	  public static EmployDAO dao() {
		    return new EmployDAO();
	  }

	public static String updateEmploy(int empno, String desig, int basic) throws SQLException {
		return dao().updateEmploy(empno, desig, basic);
	}
	public static String addEmploy(Employ employ) throws SQLException {
		EmployDAO dao = new EmployDAO();
		return dao.addEmploy(employ);
	}
	public static Employ[] showEmployAll() throws SQLException {
		EmployDAO dao = new EmployDAO();
		return dao.showAllEmploy();
	}
	public static Employ employSearch(int empno) {
		EmployDAO dao = new EmployDAO();
		return dao.searchEmploy(empno);
	}
}
