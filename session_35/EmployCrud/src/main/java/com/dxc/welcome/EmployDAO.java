package com.dxc.welcome;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL = "select * from Employ";

    public Employ searchEmploy(int empno) {
    	String cmd = "Select * from Employ where empno=?";
    	Employ employ = new Employ();
    	employ = jdbcTemplate.queryForObject(cmd,new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employ emp = new Employ(rs.getBigDecimal("empno"),
						rs.getString("name"),rs.getString("dept"),
						rs.getString("desig"),
						rs.getBigDecimal("basic")
						);
				return emp;
			}
    		
		});
    	return employ;
    }
    public String addEmploy(Employ employ) {
    	String cmd = "Insert into Employ values(?,?,?,?,?)";
    	System.out.println(employ.getEmpno());
    jdbcTemplate.update(cmd,new Object[] {
    			employ.getEmpno(),
    			employ.getName(),
    			employ.getDept(),
    			employ.getDesig(),
    			employ.getBasic()
    	});
    	return "Record Inserted...";
    }
    public List<Employ> showEmploy() {

         List<Employ> employs = new ArrayList<Employ>();
         List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);

         for (Map<String, Object> row : rows) 
         {
              Employ employ = new Employ();
              employ.setEmpno((BigDecimal)row.get("empno"));
              employ.setName((String)row.get("name"));
              employ.setDept((String)row.get("dept"));
              employ.setDesig((String)row.get("desig"));
              employ.setBasic((BigDecimal)row.get("basic"));
              

              employs.add(employ);
          }

        return employs;
    }
}
