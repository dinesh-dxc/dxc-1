package com.dxc.intf;

interface ITraining {
	void name();
	void email();
}

class Afrin implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Afrin...");
	}

	@Override
	public void email() {
		System.out.println("Email Affrin@gmail.com");
	}
	
}

class Abdul implements ITraining {

	@Override
	public void name() {
		System.out.println("Name is Abdul...");
	}

	@Override
	public void email() {
		System.out.println("Email is abdul@gmail.com");
	}
	
}
public class IntfEx {
	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Abdul(),
			new Afrin()
		};
		for (ITraining iTraining : arr) {
			iTraining.name();
			iTraining.email();
		}
	}
}
