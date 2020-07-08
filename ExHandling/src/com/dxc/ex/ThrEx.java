package com.dxc.ex;

public class ThrEx {
	public void readData() throws ClassNotFoundException {
		Class.forName("com.jdbc.odbc.Driver");
	}
	public static void main(String[] args) {
		ThrEx obj = new ThrEx();
		try {
			obj.readData();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
