package com.dxc.java;

public class Quiz3 {
	public static void main(String[] args) {
		byte b=125;
		b++;
		System.out.println(b);
		b+=7;
		System.out.println(b);
		/* Byte range from -128 to +127, 
		 * as above case it cross 127 to it turns 
		 * negative and return -123 as -128 + 5   
		 * */
	}
}
