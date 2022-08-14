 package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerJ = new Customer(10020, "James");
		Customer customerE = new GoldCustomer(10030, "Edward");
		Customer customerP = new GoldCustomer(10040, "Park");
		Customer customerK = new VIPCustomer(10050, "Kim");
		// 다형성
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		
//		for(Customer a : customerList) {
//			System.out.println(a.showCustomerInfo());
//		}
//		
//		int price = 10000;
//		for(Customer a : customerList) {
//			int cost = a.calcPrice(price);
//			System.out.println(a.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
//			System.out.println(a.getCustomerName()+"님의 현재 보너스 포인트는 " + a.bonusPoint+"입니다.");
//		}
		
		if(customerE instanceof VIPCustomer) {
		
			VIPCustomer vc = (VIPCustomer)customerE;
		}
		else if(customerE instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer)customerE;
			System.out.println(customerE.showCustomerInfo());
		}
		
		
	}

}
                                                                                                                                                                                                                                                                                                                                                                                         