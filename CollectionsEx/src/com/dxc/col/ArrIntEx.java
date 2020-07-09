package com.dxc.col;

import java.util.ArrayList;
import java.util.List;

public class ArrIntEx {
	public static void main(String[] args) {
		List nums = new ArrayList();
		nums.add(new Integer(56));
		nums.add(new Integer(11));
		nums.add(new Integer(33));
		nums.add(new Integer(19));
		nums.add(new Integer(9));
		int sum=0;
		for (Object ob : nums) {
			sum+=(Integer)ob;
		}
		System.out.println("Sum is  " +sum);
	}
}
