package com.dxc.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("e:/dxc/file1.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(12);
			dout.writeUTF("Java Training");
			dout.writeDouble(9883.55);
			dout.writeBoolean(true);
			dout.close();
			fout.close();
			System.out.println("File Created...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
