package com.dxc.col;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("1", "Annapurna");
		m.put("2", "Vennela");
		m.put("3","Narayani");
		m.put("4","Dinesh");
		m.put("5", "Prakash");
		String key="9";
		String res = (String) m.getOrDefault(key, "Not Found");
		System.out.println(res);
	}
}
