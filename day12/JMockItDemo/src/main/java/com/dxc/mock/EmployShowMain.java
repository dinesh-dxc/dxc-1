package com.dxc.mock;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployShowMain {
	public static void main(String[] args) {
//		int empno;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Employ no  ");
//		empno = sc.nextInt();
//		Employ employ = new EmployDAO().searchEmploy(empno);
//		System.out.println(employ);
		try {
			Employ e1 = new Employ(9, "kfffk", "ffhh", "adfsff", 88344);
			System.out.println(new EmployFactory().addEmploy(e1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			System.out.println(EmployFactory.updateEmploy(1, "CEO", 99221));
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
