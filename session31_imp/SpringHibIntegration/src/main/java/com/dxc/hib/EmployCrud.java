package com.dxc.hib;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployCrud {

	public Employ searchEmploy(int empno) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		Employ employ = null;
		List<Employ >employs = (List<Employ>) ht.find("from Employ where empno="+empno);
		if (employs.size() > 0) {
			employ = employs.get(0);
		}
		return employ;
	}
	
	public String addEmploy(Employ employ) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		ht.save(employ);
		return "Employ Added";
	}
	
	public List<Employ> showEmploy() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		HibernateTemplate ht=(HibernateTemplate)ctx.getBean("hibernateTemplate");
		List<Employ> employs = ht.find("from Employ");
		return employs;
	}
}
