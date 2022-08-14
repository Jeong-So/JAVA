package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(2000);
		
		System.out.println(customerLee.showCustomerInfo() + " , price : "+ price);
		
		VIPCustomer customerKim = new VIPCustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(2000);
		
		
		System.out.println(customerKim.showCustomerInfo() + " , price : "+ price);
		
		 
		Customer vc = new VIPCustomer(12345, "noname");  // Customer로 선언했으나 VIPCustomer로 인스턴스 생성
		vc.bonusPoint = 1000;  // vc는 Customer클래스 멤버만 사용가능
		price = vc.calcPrice(2000);
		
		System.out.println(vc.showCustomerInfo() + " , price : "+ price);  // 결과는 VIPCustomer 결과 (인스턴스 결과)  가상함수 결과,가상 메서드 결과
		
		
	}

}
                                                                                                                                                                                                                                                                                                                                                                                         