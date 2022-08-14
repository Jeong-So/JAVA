package ch18;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance(); // static의 경우는 new가 아닌 클래스 이름으로 가져다 씀
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar = Calendar.getInstance();
		
	}

}
