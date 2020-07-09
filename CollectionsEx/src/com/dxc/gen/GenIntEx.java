package com.dxc.gen;

import java.util.ArrayList;
import java.util.List;

public class GenIntEx {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(new Integer(24));
		nums.add(new Integer(33));
		nums.add(new Integer(9));
		nums.add(new Integer(11));
		nums.add(new Integer(10));
		int sum = 0;
		for (Integer i : nums) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
