package com.dxc.employ;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShowEmploy {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dbcontext.xml");
		DataSource ds = (DriverManagerDataSource) ctx.getBean("dataSource");
		JdbcTemplate jt = new JdbcTemplate(ds);
		String cmd = "SELECT * FROM Employ";
		List employs=null;
		employs = jt.query(cmd, new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				String employInfo = "Employ No  " +rs.getInt("empno") + " Employ Name " + 
						rs.getString("name") + " Department " +rs.getString("dept") + 
						"  Designation  " +rs.getString("desig") + "   Basic  "
						+ rs.getInt("basic");
				return employInfo;
			}
		});
		for (Object ob : employs) {
			System.out.println(ob);
		}
	}
}
