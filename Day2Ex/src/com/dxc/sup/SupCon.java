package com.dxc.sup;

class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}
class Harshita extends Employ {
	public Harshita(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Archana extends Employ {
	public Archana(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class SupCon {
	public static void main(String[] args) {
//		Employ e1 = new Harshita(1, "Harshita", 88234); 
//		Employ e2 = new Archana(3, "Archana", 88295);
		Employ[] arr = new Employ[] {
				new Harshita(1, "Harshita", 88234),
				new Archana(3, "Archana", 88295)
		};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
