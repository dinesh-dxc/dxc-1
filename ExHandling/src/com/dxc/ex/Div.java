package com.dxc.ex;

public class Div {
	public static void main(String[] args) {
		int a, b, c;
		try {
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = a/b;
			System.out.println("Division  " +c);
		} catch (NumberFormatException e) {
			System.err.println("String Cannot be converted as Integer...");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Args are not passed...");
		} catch (ArithmeticException e) {
			System.err.println("Division by zero Impossible...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Program from Dxc Batch...");
		}
	}
}
