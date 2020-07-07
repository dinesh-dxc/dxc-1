package com.dxc.abs;

abstract class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Nikitha extends Employ {
	public Nikitha(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Narendra extends Employ {
	public Narendra(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Nikitha(1, "Nikitha", 88234),
			new Narendra(3, "Narendra", 88244)
		};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
