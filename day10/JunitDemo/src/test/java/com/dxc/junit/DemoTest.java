package com.dxc.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

    static Demo obj;
	
	@BeforeClass
	public static void setUp() {
		obj = new Demo();
	}
	@Test
	public void testSum() {
		assertEquals(5, obj.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Welcome to Junit...", obj.sayHello());
	}

	@AfterClass
	public static void cleanUp() {
		obj = null;
	}
}
