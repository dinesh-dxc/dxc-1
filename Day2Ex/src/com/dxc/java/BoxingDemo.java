package com.dxc.java;

public class BoxingDemo {
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="Welcome";
		
		/* Implementing Boxing */
		Object ob1=x;
		//ob1++;
		Object ob2=y;
		Object ob3=name;
		/* Implemeting Unboxing */ 
		int x1 = (Integer)ob1;
		double y1 = (Double)ob2;
		String n1 = (String)ob3;
		System.out.println("X1 value  " +x1);
		System.out.println("Y1 value  " +y1);
		System.out.println("Name   " +n1);
	}
}
