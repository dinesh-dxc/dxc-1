package com.dxc.bank;

import java.sql.SQLException;

public class AccountService {

	public String createAccount(Account account) throws SQLException {
		AccountDAO dao = new AccountDAO();
		int accno = dao.generateAccountNo();
		account.setAccountNo(accno);
		return dao.createAccount(account);
	}
	
	public Account searchAccount(int accountNo) throws SQLException {
		return new AccountDAO().searchAccount(accountNo);
	}
}
