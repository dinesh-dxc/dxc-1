package com.dxc.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SearchEmploy {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbcontext.xml");
		DataSource ds = (DriverManagerDataSource) ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "SELECT * FROM EMPLOY Where Empno=?";
		List empInfo=null;
		empInfo=jt.query(cmd,new Object[] {empno}, new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String employInfo = "Employ No  " +rs.getInt("empno") + " Employ Name " + 
						rs.getString("name") + " Department " +rs.getString("dept") + 
						"  Designation  " +rs.getString("desig") + "   Basic  "
						+ rs.getInt("basic");
				return employInfo;
			}
		});
		if (empInfo.size() != 0) {
			System.out.println(empInfo.get(0));
		} else {
			System.out.println("Not Found...");
		}
	}
}
