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
	public void testMax3() {
		assertEquals(5, obj.max3(5, 3, 2));
		assertEquals(5, obj.max3(3, 5, 2));	
		assertEquals(5, obj.max3(2, 3, 5));	
	}
	@Test
	public void testSayHello() {
		assertEquals("Welcome to Junit...", obj.sayHello());
	}
	
	@Test
	public void testSub() {
		assertEquals(5, obj.sub(10, 5));
	}

	@AfterClass
	public static void cleanUp() {
		obj = null;
	}
}
