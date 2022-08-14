package ch16;

public abstract class PlayerLevel {

	public void go(int count) {
		run();
		jump(count);
		turn();		
	}
	
	public abstract void describe();
	
	public void run() {
		System.out.println("천천히 달립니다.");
	}
	
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("jump할 줄 모르지롱.");
		}
	}
	
	public void turn() {
		System.out.println("turn할 줄 모르지롱.");
	}
}