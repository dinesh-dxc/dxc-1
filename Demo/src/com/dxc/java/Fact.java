package com.dxc.java;

public class Fact {
	public void calc(int n) {
		int i=1;
		int f=1;
		while(i <= n) {
			f=f*i;
			i++;
		}
		System.out.println("Factorial Value  " +f);
	}
	public static void main(String[] args) {
		int n=6;
		Fact obj = new Fact();
		obj.calc(n);
	}
}