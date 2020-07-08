package com.dxc.ex;

public class Quiz1 {
	public static void main(String[] args) {
		int[] a= new int[] {1,2,3};
		try {
			a[4]=5/0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size Small...");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero impossible...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
