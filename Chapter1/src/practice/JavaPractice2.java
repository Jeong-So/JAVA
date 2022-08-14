package practice;

import java.util.Scanner;

public class JavaPractice2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int line = input/2 + input%2;
		int line2 = input%2;
		int num = input/2 ;
		int i, j, k ;
		
		for (i = 0; i < line ; i++ ) {
			for(k = 1 ; k <= num ; k++) {
				System.out.print(' ');
			}
			for(j = 1; j <= line2 ; j++) {
				System.out.print('*');
			}
			for(k = 1 ; k <= num ; k++) {
				System.out.print(' ');
			}
			line2 += 2;
			num -= 1;
			System.out.println();
		}
		
	}

}
