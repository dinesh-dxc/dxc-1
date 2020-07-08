package com.dxc.ex;

public class AssertDemo {
	public void incr(int basic) {
		for(int i=0;i<6;i++) {
			basic+=5000;
			assert basic < 51000;
			System.out.println("Updated Salary  " +basic);
		}
	}
	public static void main(String[] args) {
		int basic=30000;
		AssertDemo obj = new AssertDemo();
		obj.incr(basic);
	}
}
