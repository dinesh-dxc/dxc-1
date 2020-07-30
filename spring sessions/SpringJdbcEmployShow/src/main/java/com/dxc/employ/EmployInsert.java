package com.dxc.employ;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployInsert {
	public static void main(String[] args) {
		Employ employ = new Employ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		employ.setEmpno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Employee Name   ");
		employ.setName(sc.nextLine());
		System.out.println("Enter Department  ");
		employ.setDept(sc.nextLine());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.nextLine());
		System.out.println("Enter Basic   ");
		employ.setBasic(Integer.parseInt(sc.nextLine()));
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbcontext.xml");
		DataSource ds = (DriverManagerDataSource) ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "INSERT INTO Employ VALUES(?,?,?,?,?)";
		jt.update(cmd, new Object[] {
			employ.getEmpno(),
			employ.getName(),
			employ.getDept(),
			employ.getDesig(),
			employ.getBasic()
		});
		System.out.println("Record Inserted...");
	}
}
