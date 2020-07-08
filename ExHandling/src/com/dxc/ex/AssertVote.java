package com.dxc.ex;

public class AssertVote {
	public void show(int age) {
		assert age < 18 : "Not Elligible for voting...";
		System.out.println(age);
	}
	public static void main(String[] args) {
		int age = 21;
		new AssertVote().show(age);
	}
}
