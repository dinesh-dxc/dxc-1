package com.dxc.junit;

import java.util.Date;

public class Employ {

	private int empno;
	private String name;
	private String dept;
	private String desig;
	private String gender;
	private Date dob;
	private double basic;

	public Employ() {
	}

	public Employ(int empno, String name, String dept, String desig, String gender, Date dob, double basic) {
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.gender = gender;
		this.dob = dob;
		this.basic = basic;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", gender="
				+ gender + ", dob=" + dob + ", basic=" + basic + "]";
	}
	
	
}
