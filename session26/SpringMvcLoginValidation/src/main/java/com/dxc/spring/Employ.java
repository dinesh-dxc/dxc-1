package com.dxc.spring;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Employ {

	@NotNull
	private int empno;
	
	@Pattern(regexp="^[a-zA-Z]{3}",message="length must be 3 Alphabets")
	private String name;
	
	@Min(value =1000,message = "Minimum Value 1000")
	@Max(value = 50000, message = "Maxmium Value 50000")
	private int basic;

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

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}
	
}
