package com.dxc.gen;

public class Quiz1 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3 = new String("Hello");
		System.out.println(s1==s2); // true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s3); // false
		System.out.println(s1.equals(s3)); // true
	}
}

/* What is the difference between == and equals() */ 
/* == always checks for the address where equals() cheecks for 
the value in that object */