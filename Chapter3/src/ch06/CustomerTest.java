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
		// ������
		
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
//			System.out.println(a.getCustomerName() + "���� " + cost + "�� �����ϼ̽��ϴ�.");
//			System.out.println(a.getCustomerName()+"���� ���� ���ʽ� ����Ʈ�� " + a.bonusPoint+"�Դϴ�.");
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
                                                                                                                                                                                                                                                                                                                                                                                         