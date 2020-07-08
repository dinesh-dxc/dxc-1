package com.dxc.ex;

public class Wrapper1 {
	public static void main(String[] args) {
		// int x=12;// value type declaration
		Integer x = new Integer(12); //Declaration of wrapper class. 
		x++;
		System.out.println(x);
		/* Convert object to data type */ 
		int y = Integer.valueOf(x);
		y++;
		System.out.println(y);
	}
}
