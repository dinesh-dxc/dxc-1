package com.dxc.ex;

public class Quiz4 {
	public static void main(String[] args) {
		try {
            System.out.println("B");
         }
         catch(Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("Z");
        }
	}
}
