package com.dxc.java;

public class DayEx {
	public void check(String day) {
		if (day=="Saturday") {
			System.out.println("Saturday is WeekEnd...");
		} else if (day=="Sunday") {
			System.out.println("Sunday is Weekend...");
		} else {
			System.out.println("WeekDay " +day);
		}
	}
	public static void main(String[] args) {
		String day="Saturday";
		DayEx obj = new DayEx();
		obj.check(day);
	}
}
