package com.dxc.ex;

class NegativeException extends Exception {
	NegativeException(String error) {
		super(error);
	}
}

class NumberZeroException extends Exception {
	NumberZeroException(String error) {
		super(error);
	}
}

public class Custom {
	public void calc(int a, int b) throws NegativeException, NumberZeroException {
		if (a < 0 || b < 0) {
			throw new NegativeException("Negative Nos Not Allowed...");
		} else if (a == 0 || b == 0) {
			throw new NumberZeroException("Zero is Invalid...");
		} else {
			int c = a+b;
			System.out.println("Sum is  " +c);
		}
	}
	public static void main(String[] args) {
		int a, b;
		a=9;
		b=5;
		Custom obj = new Custom();
		try {
			obj.calc(a, b);
		} catch (NegativeException | NumberZeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
