package ch08;

public class Order {
	
	public int orderNum;
	public int phoneNum;
	public String address;
	public int orderDate;
	public int orderTime;
	public int orderPrice;
	public int nemuNum;
	
	public Order(int orderNum, int phoneNum, String address, int orderDate, int orderTime, int orderPrice, int nemuNum) { 
		this.orderNum = orderNum;
		this.phoneNum = phoneNum;
		this.address = address;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.orderPrice = orderPrice;
		this.nemuNum = nemuNum;
	}
	
	public String OrderInfo() {
		return "�ֹ� ���� ��ȣ : "+ orderNum +"\n"+
			   "�ֹ� �ڵ��� ��ȣ : " + phoneNum + "\n"+
			   "�ֹ� �� �ּ� : " + address + "\n"+
			   "�ֹ� ��¥ : " + orderDate + "\n"+
			   "�ֹ� �ð� : " + orderTime + "\n"+
			   "�ֹ� ���� : " + orderPrice + "\n"+
			   "�ֹ� ��ȣ : " + nemuNum ;
	}
}
