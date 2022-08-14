package ch16;

public abstract class PlayerLevel {

	public void go(int count) {
		run();
		jump(count);
		turn();		
	}
	
	public abstract void describe();
	
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}
	
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("jump�� �� ������.");
		}
	}
	
	public void turn() {
		System.out.println("turn�� �� ������.");
	}
}