package ch14;

public class Texi {

	String companyName;
	int money;
	
	public Texi(String companyName) {
		this.companyName = companyName;
	}
	
	
	public void take (int money) {
		this.money += money;
	}

	public void showTexiInfo() {
		System.out.println(companyName + "�ý� ������ "+ money + "�� �Դϴ�.");
	}
	
}
