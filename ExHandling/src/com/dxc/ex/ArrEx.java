package com.dxc.ex;

public class ArrEx {
	public static void main(String[] args) {
		int[] a = new int[] {12, 5};
		try {
			a[10]=77;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Size is Small...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
