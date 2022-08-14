package ch21;

public class Break {

	public static void main(String[] args) {

		int sum = 0;
		int num = 1;
		
		
//		# case 1	
		for (num = 1; sum <= 100; num++) { 
			
			sum += num;
			
		}
		System.out.println("num = " + num + " " + "sum = " + sum);
		
		
		
		
//		# case 2	
		for (;;num++) {
		sum += num;
		if (sum > 100) {
			System.out.println("num = " + num + " " + "sum = " + sum);
			break;
		}
		
	}

	}
}
