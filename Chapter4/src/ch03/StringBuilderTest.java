package ch03;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));
		System.out.println(buffer);
		
		String test = buffer.toString();
		System.out.println(test);
		String test2 = new String("test2");
		
		System.out.println(System.identityHashCode(test));
		test = test.concat(test2);
		System.out.println(test);	
		System.out.println(System.identityHashCode(test));
		
	}

}
