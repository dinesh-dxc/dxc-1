package com.dxc.col;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(obj));
		
		String dt = "20-12-2020";
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date d = sdf.parse(dt);
			System.out.println(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
