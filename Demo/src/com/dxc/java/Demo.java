package com.dxc.java;

class Data {
	public void sayHello() {
		System.out.println("Welcome to Java Program...");
	}
	private void lunch() {
		System.out.println("Lunch at 1.15 PM...");
	}
	void logout() {
		System.out.println("Logout by 5.30 PM...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Data obj = new Data();
		obj.sayHello();
		obj.logout();
	}
}
