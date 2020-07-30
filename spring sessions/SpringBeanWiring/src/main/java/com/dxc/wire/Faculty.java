package com.dxc.wire;

import java.util.List;

public class Faculty {

	private String facultyName;
	private List<Student> students;
	
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public void teaching() {
		System.out.println("Faculty   " +facultyName + " Having Lunch with Following Student");
		for (Student student : students) {
			student.display();
		}
	}
}
