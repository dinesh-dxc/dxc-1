package com.dxc.employ;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployShow {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbcontext.xml");
		DataSource ds = (DriverManagerDataSource) ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "SELECT * FROM Employ";
		List<Employ> employs=null;
		
		employs=jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ e = new Employ(rs.getInt("empno"), rs.getString("name"), 
						rs.getString("dept"), rs.getString("desig"), rs.getInt("basic"));
				return e;
			}
		});
		for (Employ e : employs) {
			System.out.println(e);
		}
	}
}
