package ch08;

public class CharaterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		int ch2 = 66;
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		char ch3 = 67;
		
		System.out.println(ch3);
		System.out.println((char)ch3);
		System.out.println((int)ch3);
		
		char han = '��';
		char ch = '\uD55C';
		
		System.out.println(han);
		System.out.println((int)han);
		System.out.println(ch);
		
		int xnum = 0XD55C;
		System.out.println(xnum);
	}

}
