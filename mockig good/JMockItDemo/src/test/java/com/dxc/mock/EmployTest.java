package com.dxc.mock;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class EmployTest {

	@Test
	public void testEmploySearch(@Mocked final EmployDAO dao) {
		final Employ e1 = new Employ(100, "Raju", "Java", "Programmer", 44443);
		new Expectations(){
            {
            	dao.searchEmploy(100); result = e1;
            	dao.searchEmploy(200); result = null;
            }
        };
		 new MockUp<EmployFactory>() 
	        {
	            @Mock
	            EmployDAO dao() {
	                return dao;
	            }
	        };
	    Employ res1 = EmployFactory.employSearch(100);
	    assertNotNull(res1);
	    Employ res2 = EmployFactory.employSearch(200);
	    assertNull(res2);
	}
}
