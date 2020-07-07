package com.dxc.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Raj extends Training {
	@Override
	void name() {
		System.out.println("Name is Raj...");
	}
	@Override
	void email() {
		System.out.println("Email is raj@gmail.com");
	}
}

class Annapurna extends Training {

	@Override
	void name() {
		System.out.println("Name is Annapurna...");
	}

	@Override
	void email() {
		System.out.println("Email is annapurna@gmail.com");
	}
}

class Siva extends Training {

	@Override
	void name() {
		System.out.println("Name is Siva...");
	}

	@Override
	void email() {
		System.out.println("Email is siva@gmail.com");
	}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		Training[] arr = new Training[] {
			new Raj(),
			new Annapurna(),
			new Siva()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
