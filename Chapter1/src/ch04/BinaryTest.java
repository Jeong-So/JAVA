package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0b00000000000000000000000000000011;
		int bNum2 = 0b11111111111111111111111111111101;
//		int bNum = 0b0000000000000011;
//		int bNum2 = 0b1111111111111101;
		int oNum = 016;
		int xNum = 0xb3;
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(bNum2);
		System.out.println(bNum+bNum2);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}
