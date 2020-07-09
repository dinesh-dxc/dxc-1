package com.dxc.col;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseDemo {
	public static void main(String[] args) {
		String str="12-12-2000";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date dt = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
