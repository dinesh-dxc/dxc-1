package com.dxc.rest;

public class MainProg {

	public static void main(String[] args) {
		EmployCrud obj = new EmployCrud();
		Employ[] res = obj.showEmploy();
		for(Employ e : res) {
			System.out.println(e);
		}
	}
}
