package ch16;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void describe() {
		
		System.out.println("***** 중급자 레벨입니다. ******");
		
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("높이 jump를 합니다.");
		}
	}


}
