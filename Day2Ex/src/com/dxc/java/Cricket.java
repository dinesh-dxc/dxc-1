package com.dxc.java;

public class Cricket {
	static int score;
	public void incr(int x) {
		score+=x;
	}
	public static void main(String[] args) {
		Cricket fb = new Cricket();
		Cricket sb = new Cricket();
		Cricket ext = new Cricket();
		fb.incr(56);
		sb.incr(23);
		ext.incr(11);
		System.out.println("Total Score " +Cricket.score);
	}
}
