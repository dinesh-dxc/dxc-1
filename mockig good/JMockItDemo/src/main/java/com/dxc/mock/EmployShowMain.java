package com.dxc.mock;

import java.util.Scanner;

public class EmployShowMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ no  ");
		empno = sc.nextInt();
		Employ employ = new EmployDAO().searchEmploy(empno);
		System.out.println(employ);
	}
}
