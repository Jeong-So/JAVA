package ch16;

public class PlayerLevelTest {

	public static void main(String[] args) {
		
		
		PlayerLevel playerB = new BeginnerLevel();
		PlayerLevel playerA = new AdvancedLevel();
		PlayerLevel playerS = new SuperLevel();
		
		playerB.describe();
		playerB.go(1);
		
		playerA.describe();
		playerA.go(2);
		
		playerS.describe();
		playerS.go(3);
		

	}

}
