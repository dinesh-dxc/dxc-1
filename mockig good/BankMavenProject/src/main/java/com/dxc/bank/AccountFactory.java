package com.dxc.bank;

import java.sql.SQLException;

public class AccountFactory {
	public static Account findAccount(int accountNo) throws SQLException {
		AccountDAO dao = new AccountDAO();
		return dao.searchAccount(accountNo);
	}
}
