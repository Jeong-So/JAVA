package ch16;

public class SuperLevel extends PlayerLevel {

	@Override
	public void describe() {
		
		System.out.println("***** ����� �����Դϴ�. ******");
		
	}
	
	@Override
	public void run() {
		System.out.println("��û ���� �޸��ϴ�.");
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("���� ���� jump�� �մϴ�.");
		}
	}

	@Override
	public void turn() {
		System.out.println("�� ���� ���ϴ�");
		
	}

}
