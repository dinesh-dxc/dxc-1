package com.dxc.project;

public class StudentException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentException() {
	}
	
	public StudentException(String error) {
		super(error);
	}
}
