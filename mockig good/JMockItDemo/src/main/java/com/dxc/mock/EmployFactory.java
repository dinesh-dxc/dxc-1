package com.dxc.mock;

public class EmployFactory {
	public static Employ employSearch(int empno) {
		EmployDAO dao = new EmployDAO();
		return dao.searchEmploy(empno);
	}
}
