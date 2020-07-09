package com.dxc.col;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
	public static void main(String[] args) {
		List students = new ArrayList();
		String dob1="12-12-1999";
		String dob2="09-03-1998";
		String dob3="12-01-2000";
		String dob4="31-03-2000";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			students.add(new Student(1, "Archana", sdf.parse(dob1), 9.3));
			students.add(new Student(2, "Raj", sdf.parse(dob2), 9.5));
			students.add(new Student(3, "Narayani", sdf.parse(dob3), 9.1));
			students.add(new Student(4, "Sumit", sdf.parse(dob4), 9.2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Names are  ");
		for (Object ob : students) {
			Student s = (Student)ob;
			System.out.println(s);
		}
	}
}
