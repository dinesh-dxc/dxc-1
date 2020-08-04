package com.dxc.spring;

import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Login {

	@NotNull 
	@Size(min=3,message="Min 3 characters Mandetory")
	private String userName;
	
	@NotNull
	@Size(min=4,message="Min 4 characters Mandetory")
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
}
