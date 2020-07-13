package com.dxc.thr;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class C3 implements Runnable {

	@Override
	public void run() {
		SortedSet s = new TreeSet();
		s.add("Nikitha");
		s.add("Afrin");
		s.add("Raj");
		s.add("Annapurna");
		s.add("Keerthana");
		s.add("Dinesh");
		
		for (Object ob : s) {
			System.out.println("Treeset Data " +ob);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class C2 implements Runnable {
	@Override
	public void run() {
		Set s = new LinkedHashSet();
		s.add("Sumit"); 
		s.add("Vennela");
		s.add("Snehal");
		s.add("Narendra");
		s.add("Nikitha");
		for (Object ob : s) {
			System.out.println("Linked Hashset Data " +ob);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class C1 implements Runnable {

	@Override
	public void run() {
		List names = new ArrayList();
		names.add("Siva");
		names.add("Sanil");
		names.add("Rutuja");
		names.add("Vidhya");
		names.add("Supriya");
		
		for (Object ob : names) {
			System.out.println("ArrayList Data " +ob);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThrTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C1());
		Thread t2 = new Thread(new C2());
		Thread t3 = new Thread(new C3());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
