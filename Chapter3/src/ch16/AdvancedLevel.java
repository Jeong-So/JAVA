package ch16;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void describe() {
		
		System.out.println("***** �߱��� �����Դϴ�. ******");
		
	}

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("���� jump�� �մϴ�.");
		}
	}


}
