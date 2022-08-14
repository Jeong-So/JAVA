package ch02;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price - price*salesRatio);
	}
	
	public String getAgetID() {
		return agentID;
	}
	
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
