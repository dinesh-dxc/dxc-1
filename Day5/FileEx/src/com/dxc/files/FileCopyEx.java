package com.dxc.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
	public static void main(String[] args) {
		try {
			FileInputStream src = new FileInputStream("C:/Java_Dxt/Day4/CollectionsEx/src/com/dxc/col/ArrListDemo.java");
			FileOutputStream tar = new FileOutputStream("e:/dxc/CpyNew.java");
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();
			tar.close();
			System.out.println("*** File Copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
