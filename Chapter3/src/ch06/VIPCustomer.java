package ch06;

public class VIPCustomer extends Customer {

	

	double salesRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); // 하위클래스가 상위클래스 인스턴스의 상위값을 가지게됨
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
	}

	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price - price*salesRatio);
	}  // 오버라이딩

	public String getAgetID() {
		return agentID;
	}
	
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
}
