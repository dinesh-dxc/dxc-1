package com.dxc.java;

public class Employ {
	int empno;
	String name;
	double basic;
	public Employ() {
		this.empno=5;
		this.name="Abdul";
		this.basic=72355;
	}
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	public static void main(String[] args) {
		Employ e1 = new Employ();
		System.out.println(e1);
		Employ e2 = new Employ(12, "Archana", 55234);
		System.out.println(e2);
	}
}
