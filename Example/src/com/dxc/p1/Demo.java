package com.dxc.p1;

public class Demo {
	private String topic="java";
	public String company="Dxc";
	protected String trainer="Prasanna";
	String vendor="Spring People";
	
	public void show() {
		Demo obj = new Demo();
		System.out.println(obj.topic);
		System.out.println(obj.company);
		System.out.println(obj.trainer);
		System.out.println(obj.vendor);
	}
}
