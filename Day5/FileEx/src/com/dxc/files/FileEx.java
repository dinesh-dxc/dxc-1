package com.dxc.files;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File f1 = new File("C:/Java_Dxt/Day4/CollectionsEx/src/com/dxc/col/ArrListDemo.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Parent Directory  " +f1.getParent());
		System.out.println("Path  " +f1.getPath());
		File f2 = new File("C:/Java_Dxt/Day4/CollectionsEx/src/com/dxc/col/");
		String[] files = f2.list();
		System.out.println("List of Files are ");
		System.out.println("------------------");
		for (String s : files) {
			System.out.println(s);
		}
		
	}
}
