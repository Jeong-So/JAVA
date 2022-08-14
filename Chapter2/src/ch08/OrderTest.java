package ch08;

public class OrderTest {

	public static void main(String[] args) {

		Order OrderHome = new Order(2020110203, 97779404, "서울시 노원구", 20201102, 130258, 35000, 003);
		
		System.out.println(OrderHome.OrderInfo());
		
	}

}
