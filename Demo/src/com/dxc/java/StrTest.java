package com.dxc.java;

public class StrTest {
	public void show() {
		String str = "Welcome to Java Programming...";
		System.out.println("Length of String is  " +str.length());
		System.out.println("First Occurrence  " +str.indexOf("a"));
		System.out.println("Char at 5th position  " +str.charAt(5));
		System.out.println("Upper Case " +str.toUpperCase());
		System.out.println("Lower Case  " +str.toLowerCase());
		System.out.println("Substring is  " +str.substring(3,19));
		System.out.println(str.replace("Java", "J2EE"));
	}
	public static void main(String[] args) {
		StrTest obj = new StrTest();
		obj.show();
	}
}
