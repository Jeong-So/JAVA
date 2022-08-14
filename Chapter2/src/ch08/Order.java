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
		return "주문 접수 번호 : "+ orderNum +"\n"+
			   "주문 핸드폰 번호 : " + phoneNum + "\n"+
			   "주문 집 주소 : " + address + "\n"+
			   "주문 날짜 : " + orderDate + "\n"+
			   "주문 시간 : " + orderTime + "\n"+
			   "주문 가격 : " + orderPrice + "\n"+
			   "주문 번호 : " + nemuNum ;
	}
}
