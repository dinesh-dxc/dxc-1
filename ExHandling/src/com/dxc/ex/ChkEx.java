package com.dxc.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ChkEx {

	public void check() throws FileNotFoundException {
		FileInputStream fin = new FileInputStream("e:/hi.txt");
	}
	public static void main(String[] args) {
		ChkEx obj = new ChkEx();
		try {
			obj.check();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
