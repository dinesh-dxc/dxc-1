package com.dxc.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAO {

	public int authenticate(String user, String password) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Customer where CUS_USERNAME=? "
				+ " AND CUS_PASSWORD=?";
		PreparedStatement  pst = con.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, password);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		return cnt;
	}
}
