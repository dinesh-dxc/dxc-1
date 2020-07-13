package com.dxc.thr;

class Data {
	synchronized void showMsg(String name) {
		System.out.print("Hi " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are u...");
	}
}

// If we pass name as "Aniruddha" expected ouput as Hi Aniruddha How are u...

class Aniruddha implements Runnable {

	Data d;
	Aniruddha(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.showMsg("Aniruddha");
	}

	
}

class Madhura implements Runnable {

	Data d;
	
	Madhura(Data d) {
		this.d=d;
	}
	
	@Override
	public void run() {
		d.showMsg("Madhura");
	}
	
}

class Prakash implements Runnable {

	Data d;
	
	Prakash(Data d) {
		this.d=d;
	}
	@Override
	public void run() {
		d.showMsg("Prakash");
	}
	
}
public class Sync {
	public static void main(String[] args) {
		Data d = new Data();
		Thread t1 = new Thread(new Aniruddha(d));
		Thread t2 = new Thread(new Prakash(d));
		Thread t3 = new Thread(new Madhura(d));
		
		t1.start();
		t2.start();
		t3.start();
	}
}
