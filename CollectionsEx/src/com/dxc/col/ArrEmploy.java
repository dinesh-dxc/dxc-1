package com.dxc.col;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	public static void main(String[] args) {
		List employs = new ArrayList();
		employs.add(new Employ(1, "Afrin", 88665));
		employs.add(new Employ(3, "Siva", 88434));
		employs.add(new Employ(4, "Annapurna", 88955));
		employs.add(new Employ(5, "Vidhya", 89224));
		employs.add(new Employ(6, "Supriya", 88295));
		for (Object ob : employs) {
			Employ e = (Employ)ob;
			System.out.println(e);
		}
	}
}
