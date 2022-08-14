package ch20;

public class NestedLoop {

	public static void main(String[] args) {
		
//		int i, j, k;
//		
//		for(i=1; i<10; i++) {
//			for(j=1; j<10;j++) {
//				
//				k = i*j;
//				
//				System.out.println(i + "X" + j + " = " + k);
//				
//			}
//			System.out.println("\n");
//		}
		
//		
//		int dan = 2;
//		int count = 1;
//		
//		for(; dan<10; dan++) {
//			for(count = 1 ; count<10 ; count++) {
//				
//				
//				System.out.println(dan + "X" + count + " = " + dan*count);
//				
//			}
//			System.out.println();
//		}
//		
		int l = 1;
		int m = 1;
		
		while(l < 10) {
			while(m < 10) {
				System.out.println(l + "X" + m + " = " + l*m);
				m++;
			}
			l++;
			m = 1;
			System.out.println();
		}
		
	}

}
