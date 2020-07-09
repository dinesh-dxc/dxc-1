package com.dxc.gen;

class Data<T> {
	public void swap(T a, T b) {
		T c;
		c=a;
		a=b;
		b=c;
		System.out.println("A value " +a+ " B value  " +b);
	}
}
public class SwapEx {
	public static void main(String[] args) {
		int a=12;
		int b=7;
		Data obj = new Data();
		obj.swap(a, b);
		String s1="Raj", s2 ="Aniruddha";
		obj.swap(s1, s2);
		double d1=12.5, d2=8.6;
		obj.swap(d1, d2);
	}
}
