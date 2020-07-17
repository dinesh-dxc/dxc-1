package com.dxc.bank;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class AccountMockTest {	

	@Test
	public void testAccountById(@Mocked final AccountDAO dao) throws SQLException {

		final Account account1 = new Account(100, "Madhura", "Sulakhe", "Pune", "MH", 37475, "Yes", "Savings", "active", null);

		 new Expectations() {
			 {
				 dao.searchAccount(100); result = account1;
				 dao.searchAccount(200); result = null;
			 }
		};
		 new MockUp<AccountFactory>() 
	        {
	            @Mock
	            AccountDAO dao() {
	                return dao;
	            }
	        };
	        
	    Account result1 = AccountFactory.findAccount(100);
	    assertNotNull(result1);
	    Account result2 = AccountFactory.findAccount(200);
	    assertNull(result2);
	}	
}
