package com.dxc.ex;

public class Wrapper2 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {
				new Integer(12),
				new Integer(5),
				new Integer(67),
				new Integer(83)
		};
		int sum = 0;
		for (Integer i : arr) {
			sum +=i;
		}
		System.out.println("Sum is  " +sum);
	}
}
