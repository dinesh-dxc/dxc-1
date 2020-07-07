package com.dxc.java;

public class SbExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome to Java");
		System.out.println(sb);
		sb.append("...Trainer Prasanna");
		System.out.println(sb);
		sb.append("\n Day 2 java Training");
		System.out.println(sb);
		sb.delete(4, 8);
		System.out.println(sb);
		sb.insert(4, "ome ");
		System.out.println(sb);
		System.out.println(sb.indexOf("e"));
	}
}
