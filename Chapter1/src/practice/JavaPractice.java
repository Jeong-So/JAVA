package practice;

public class JavaPractice {

	public static void main(String[] args) {
		
		int i, j ;
		
		for (i=1; i < 10; i++) {
			for (j=1; i < 10; j++) {
				
				if(i<j) break;
				
				System.out.println(i + "X" + j + " = " + i*j);
				
			}
		}
		
	}

}
