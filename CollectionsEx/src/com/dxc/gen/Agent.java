package com.dxc.gen;

public class Agent {

	private int agentId;
	private String agentName;
	private String city;
	private String gender;
	private double premium;
	public Agent() {

	}
	public Agent(int agentId, String agentName, String city, String gender, double premium) {
		this.agentId = agentId;
		this.agentName = agentName;
		this.city = city;
		this.gender = gender;
		this.premium = premium;
	}
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
}
