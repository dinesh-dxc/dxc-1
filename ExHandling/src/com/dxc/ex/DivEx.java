package com.dxc.ex;

public class DivEx {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division  " +c);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getClass().getSimpleName());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Args are not passed...");
		} catch (ArithmeticException e) {
			System.err.println("Division By Zero Impossible...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program by Dxc Team...");
		}
	}
}
