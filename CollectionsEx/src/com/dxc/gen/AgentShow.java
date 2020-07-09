package com.dxc.gen;

public class AgentShow {
	public static void main(String[] args) {
		Agent agent = new Agent();
		
		Agent agentNew = new Agent(3, "Madhura", "Hyderabad", "Female", 88235.32);
		/* Assign Values */
		
		agent.setAgentId(1);
		agent.setAgentName("Narendra");
		agent.setCity("Pune");
		agent.setGender("Male");
		agent.setPremium(88234);
		
		/* Print Agent Values */
		System.out.println("Agent Id  " +agent.getAgentId());
		System.out.println("Agent Name  " +agent.getAgentName());
		System.out.println("City   " +agent.getCity());
		System.out.println("Gender  " +agent.getGender());
		System.out.println("Premium  " +agent.getPremium());
		
		/* Print AgentNew Values */
		System.out.println("Agent Id  " +agentNew.getAgentId());
		System.out.println("Agent Name  " +agentNew.getAgentName());
		System.out.println("City   " +agentNew.getCity());
		System.out.println("Gender   " +agentNew.getGender());
		System.out.println("Premium   " +agentNew.getPremium());
	} 
}
