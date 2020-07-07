package com.dxc.fin;

class Employ {
	final void admin() {
		System.out.println("Admin is Ashish...");
	}
}

class Hr extends Employ {
//	void admin() {
//		System.out.println("Admin is Subhash...");
//	}
	// Not Possible, because final methods cannot be overrided.
}
public class Final1 {

}
