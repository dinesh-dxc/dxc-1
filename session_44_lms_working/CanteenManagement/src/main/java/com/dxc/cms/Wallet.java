package com.dxc.cms;

public class Wallet {

	private int walletId;
	private int custId;
	private String walletSource;
	private double walletAmount;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getWalletId() {
		return walletId;
	}
	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}
	public String getWalletSource() {
		return walletSource;
	}
	public void setWalletSource(String walletSource) {
		this.walletSource = walletSource;
	}
	public double getWalletAmount() {
		return walletAmount;
	}
	public void setWalletAmount(double walletAmount) {
		this.walletAmount = walletAmount;
	}
	
	
}
