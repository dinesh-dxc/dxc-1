package com.dxc.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[] args) {
		File f1 = new File("E:/dxc/hello.txt");
		try {
			FileWriter fw = new FileWriter(f1);
			fw.write("Welcome to Java Files Concept...");
			fw.write("Program by Dxc Team");
			fw.close();
			System.out.println("File Created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
