package com.dxc.mock;

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
public class EmployMockTest {

	@Test
	public void testUpdateEmploy(@Mocked final EmployDAO dao) throws SQLException {
		new Expectations() {
			{
				dao.updateEmploy(12, "XYZ", 88234);
			}
		};
		 new MockUp<EmployFactory>() 
	        {
	            @Mock
	            EmployDAO dao() {
	                return dao;
	            }
	        };
	    System.out.println(EmployFactory.updateEmploy(12, "XYZ", 88234));
	}
	@Test
	public void testAddEmploy(@Mocked final EmployDAO dao) throws SQLException {
		new Expectations() {
			{
				System.out.println(dao.addEmploy(new Employ(888, "Archana", "Java", "Programmer", 88445)));
				dao.addEmploy(new Employ(888, "Archana", "Java", "Programmer", 88445)); result = "Employ Record Inserted..."; 
			}
		};
		 new MockUp<EmployFactory>() 
	        {
	            @Mock
	            EmployDAO dao() {
	                return dao;
	            }
	        };
	   String result1 = EmployFactory.addEmploy(new Employ(-1,"Archana","Java","Programmer",88455));
	   System.out.println(result1);
	   assertEquals("Employ Record Inserted...", result1);
	}
	
	@Test
	public void testEmployShowAll(@Mocked final EmployDAO dao) throws SQLException {
		final Employ[] arrDummy = new Employ[] {
			new Employ(1, "Aniruddha", "Java", "Programmer", 88422),
			new Employ(2, "Snehal", "SQL", "Developer", 55234),
			new Employ(3, "Rutuja", "Angular", "Expert", 89234)
		};
		new Expectations() {
			{
				dao.showAllEmploy(); result = arrDummy;
			}
		};
		 new MockUp<EmployFactory>() 
	        {
	            @Mock
	            EmployDAO dao() {
	                return dao;
	            }
	        };
	     Employ[] arr = EmployFactory.showEmployAll();
	     assertEquals(3, arr.length);
	}
	
	@Test
	public void testEmploySearch(@Mocked final EmployDAO dao) {
		final Employ e1 = new Employ(100, "Raju", "Java", "Programmer", 44443);
		 new Expectations() {
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
	        
	    Employ result1 = EmployFactory.employSearch(100);
	    assertNotNull(result1);
	    Employ result2 = EmployFactory.employSearch(200);
	    assertNull(result2);
	}

}
