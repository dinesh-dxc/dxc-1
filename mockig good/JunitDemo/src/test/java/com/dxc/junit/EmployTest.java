package com.dxc.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class EmployTest {

	static Employ employ;
	
	@BeforeClass
	public static void setUp() {
		employ = new Employ();
	}
	
	@Test
	public void testToString() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date dob = sdf.parse("12-12-2000");
		Employ employNew = new Employ(1, "Mohammad", "Dotnet", "Programmer", "Male", dob, 12433.0);
		String result = "Employ [empno=" + 1 + ", name=" + "Mohammad" + ", dept=" + "Dotnet" + 
				", desig=" + "Programmer" + ", gender=" + "Male" + ", dob=" + dob + ", basic=" + 12433.0 +"]";
		assertEquals(employNew.toString(), result);
	}
	@Test
	public void testConstructor() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date dob = sdf.parse("12-12-2000");
		Employ employNew = new Employ(1, "Mohammad", "Dotnet", "Programmer", "Male", dob, 12433);
		
		assertEquals(1, employNew.getEmpno());
		assertEquals("Mohammad", employNew.getName());
		assertEquals("Dotnet", employNew.getDept());
		assertEquals("Programmer", employNew.getDesig());
		assertEquals("Male", employNew.getGender());
		assertEquals("12-12-2000", sdf.format(employNew.getDob()));
		assertEquals(12433, employNew.getBasic(), 0);
	}

	@Test
	public void testGettersAndSetters() throws ParseException {
		employ.setEmpno(1);
		employ.setName("Prakash");
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setGender("Male");
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date dob = sdf.parse("12-12-1999");
		employ.setDob(dob);
		employ.setBasic(12000);
		
		assertEquals(1, employ.getEmpno());
		assertEquals("Prakash", employ.getName());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals("Male", employ.getGender());
		assertEquals("12-12-1999", sdf.format(employ.getDob()));
		assertEquals(12000, employ.getBasic(), 0);
	}

}
