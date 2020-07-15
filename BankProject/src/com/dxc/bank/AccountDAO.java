package com.dxc.bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Account searchAccount(int accountNo) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Account Where AccountNo=?";
		Account account = null;
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			account = new Account();
			account.setAccountNo(rs.getInt("accountNo"));
			account.setFirstName(rs.getString("firstName"));
			account.setLastName(rs.getString("lastName"));
			account.setCity(rs.getString("city"));
			account.setState(rs.getString("state"));
			account.setAmount(rs.getInt("amount"));
			account.setCheqFacil(rs.getString("cheqFacil"));
			account.setAccountType(rs.getString("accountType"));
		}
		return account;
	}
	
	public String createAccount(Account account) throws SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert INTO ACCOUNT(AccountNo,FirstName,LastName,City,State,Amount,CheqFacil,AccountType) " + 
				"values(?, ?, ?, ?, ?, ?, ?, ?)";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1, account.getAccountNo());
		pst.setString(2, account.getFirstName());
		pst.setString(3, account.getLastName());
		pst.setString(4, account.getCity());
		pst.setString(5, account.getState());
		pst.setInt(6, account.getAmount());
		pst.setString(7, account.getCheqFacil());
		pst.setString(8, account.getAccountType());
		pst.executeUpdate();
		return "Account Created Successfully...";
	}
	
	public int generateAccountNo() throws SQLException {
		connection = ConnectionHelper.getConnection();
		int accountNo=0;
		pst=connection.prepareStatement("SELECT CASE WHEN MAX(ACCOUNTNO) IS NULL THEN 1 " + 
				"   ELSE MAX(ACCOUNTNO)+1 END accno FROM Account");
		ResultSet rs = pst.executeQuery();
		rs.next();
		accountNo = rs.getInt("accno");
		return accountNo;
	}
}
