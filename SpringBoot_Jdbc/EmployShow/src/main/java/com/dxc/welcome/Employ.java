package com.dxc.welcome;

import java.math.BigDecimal;

public class Employ {

	private BigDecimal empno;
	private String name;
	private String dept;
	private String desig;
	private BigDecimal basic;
	public BigDecimal getEmpno() {
		return empno;
	}
	public void setEmpno(BigDecimal empno) {
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
	public BigDecimal getBasic() {
		return basic;
	}
	public void setBasic(BigDecimal basic) {
		this.basic = basic;
	}
	public Employ(BigDecimal empno, String name, String dept, String desig, BigDecimal basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	
	public Employ() {}
}
