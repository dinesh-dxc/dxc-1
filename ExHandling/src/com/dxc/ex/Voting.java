package com.dxc.ex;

class VotingException extends Exception {
	VotingException(String error) {
		super(error);
	}
}

public class Voting {
	public void check(int age) throws VotingException {
		if (age < 18) {
			throw new VotingException("You ar not elligible for voting...");
		} else {
			System.out.println("You are elligible for voting...");
		}
	}
	public static void main(String[] args) {
		int age = 27;
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
