package com.dxc.ex;

public class Ex1 {
	
	public void check(int n) {
		if (n < 0) {
			ArithmeticException ex1 = new ArithmeticException("Negative Nos Not Allowed...");
			throw ex1;
		} else if (n == 0) {
			throw new NumberFormatException("Zero is Invalid");
		} else {
			System.out.println("N value is  " +n);
		}
	}
	public static void main(String[] args) {
		int n=3;
		Ex1 obj = new Ex1();
		try {
			obj.check(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
