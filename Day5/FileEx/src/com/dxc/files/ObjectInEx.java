package com.dxc.files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("e:/dxc/objex.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
//			String str = null;
//			Date dt = null;
			while(objin.available()==0) {
				System.out.println(objin.readObject());
			}
			objin.close();
			fin.close();
		} catch (EOFException e) {
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
