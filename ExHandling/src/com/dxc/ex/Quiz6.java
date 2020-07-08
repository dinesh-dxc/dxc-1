package com.dxc.ex;

public class Quiz6 {
	public static void main(String[] args) {
		try {
            int a=0;
            int b=4;
            int c=a/b;
            System.out.println("Hi");
        } catch(ArithmeticException e) {
            System.out.println("Divex");
        } finally {
            System.out.println("Program End...");
        }
        System.out.println("Program from Dxc");
	}
}
