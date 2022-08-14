package ch13;

public class BitOperationTest {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		System.out.println(num1 >> 1);
		
		int num3 = -5;
		System.out.println(num3 >> 1);
		System.out.println(num3 >>> 1);
	}

}
