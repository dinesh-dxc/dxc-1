package com.dxc.java;

public class CircleDemo {
	public void calc(double radius) {
		double area, circ;
		area = Math.PI*Math.pow(radius, 2);
		circ = 2 * Math.PI * radius;
		System.out.println("Area of Circle  " +area);
		System.out.println("Circumference   " +circ);
	}
	public static void main(String[] args) {
		double radius=8.7;
		CircleDemo obj = new CircleDemo();
		obj.calc(radius);
	}
}
