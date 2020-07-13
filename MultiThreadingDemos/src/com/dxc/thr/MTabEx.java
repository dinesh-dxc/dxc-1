package com.dxc.thr;

class Table {
	synchronized public void showTab(int n) {
		int p;
		for(int i=1;i<=10;i++) {
			p=n*i;
			System.out.println(n + " *  " +i+ " = " +p);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Tab1 implements Runnable {

	Table t;
	Tab1(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.showTab(12);
	}
}

class Tab2 implements Runnable {
	Table t;
	
	Tab2(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.showTab(7);
	}
}

class Tab3 implements Runnable {

	Table t;
	
	Tab3(Table t) {
		this.t=t;
	}
	@Override
	public void run() {
		t.showTab(19);
	}
	
}
public class MTabEx {
	public static void main(String[] args) {
		Table t = new Table();
		Thread t1 = new Thread(new Tab1(t));
		Thread t2 = new Thread(new Tab2(t));
		Thread t3 = new Thread(new Tab3(t));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
