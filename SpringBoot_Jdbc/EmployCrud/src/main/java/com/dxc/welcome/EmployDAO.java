package com.dxc.welcome;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String SQL = "select * from Employ";

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
