package ch17;

public class WhileTest {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while(i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 10까지 더한 수는 " + sum + "입니다.");
		
	}

}
