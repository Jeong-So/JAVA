package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(2000);
		
		System.out.println(customerLee.showCustomerInfo() + " , price : "+ price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(2000);
		
		
		System.out.println(customerKim.showCustomerInfo() + " , price : "+ price);
		
		 
		Customer vc = new VIPCustomer(12345, "noname");  // Customer�� ���������� VIPCustomer�� �ν��Ͻ� ����
		vc.bonusPoint = 1000;  // vc�� CustomerŬ���� ����� ��밡��
		price = vc.calcPrice(2000);
		
		System.out.println(vc.showCustomerInfo() + " , price : "+ price);  // ����� VIPCustomer ��� (�ν��Ͻ� ���)  �����Լ� ���,���� �޼��� ���
		
		
	}

}
                                                                                                                                                                                                                                                                                                                                                                                         