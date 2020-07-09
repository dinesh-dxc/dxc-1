package com.dxc.col;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	int sno;
	String name;
	Date dob;
	double cgp;
	
	public Student() {
	}
	
	public Student(int sno, String name, Date dob, double cgp) {
		this.sno = sno;
		this.name = name;
		this.dob = dob;
		this.cgp = cgp;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "Student [sno=" + sno + ", name=" + name + ", dob=" + sdf.format(dob) + ", cgp=" + cgp + "]";
	}
	
	
}
