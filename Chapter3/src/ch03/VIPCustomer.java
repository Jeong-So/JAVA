package ch03;

public class VIPCustomer extends Customer {

	

	double salesRatio;
	private String agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName); // ����Ŭ������ ����Ŭ���� �ν��Ͻ��� �������� �����Ե�
		
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		
		System.out.println("customerGrade : "+ customerGrade + " , bonusRatio : "+ bonusRatio);
		System.out.println("VIPCustomer() call");
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
