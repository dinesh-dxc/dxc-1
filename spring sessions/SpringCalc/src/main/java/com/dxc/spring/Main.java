package com.dxc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("calc.xml");
		Calc c = (Calc)ctx.getBean("bean1");
		System.out.println("Sum   " +c.sum());
		System.out.println("Sub   " +c.sub());
		System.out.println("Mult  " +c.mult());
	}
}
