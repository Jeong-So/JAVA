package practice;

import java.util.Scanner;

public class JavaPractice5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int line2 = input%2;
		int num = input/2 ;
		int i, j, k ;
		
		for (i = 0; i < input ; i++ ) {
			for(k = 1 ; k <= num ; k++) {
				System.out.print(' ');
			}
			for(j = 1; j <= line2 ; j++) {
				System.out.print('*');
			}
			for(k = 1 ; k <= num ; k++) {
				System.out.print(' ');
			}
			
			if (i < input/2) {
				line2 += 2;
				num -= 1;
//				System.out.println(line2);
//				System.out.println(num);
			}
			else { 
				line2 -= 2;
				num += 1;
//				System.out.println(line2);
//				System.out.println(num);
			}
			System.out.println();
		}
		
		
//		line2 -= 4;
//		num += 2;
//		
//		for (i = 0; i < input/2 ; i++ ) {
//			for(k = 1 ; k <= num ; k++) {
//				System.out.print(' ');
//			}
//			for(j = 1; j <= line2 ; j++) {
//				System.out.print('*');
//			}
//			for(k = 1 ; k <= num ; k++) {
//				System.out.print(' ');
//			}
//			line2 -= 2;
//			num += 1;
//			System.out.println();
//		}
//		
	}

}
