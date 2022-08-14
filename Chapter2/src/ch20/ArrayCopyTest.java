package ch20;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] arrcopy = new int[8];
		
//		for(int i = 0, num = 1; i < arr.length; i++ ) {
//			arr[i] = num++;
//			System.out.println(arr[i]);
//		}
		
		System.arraycopy(arr, 3, arrcopy, 4, 3);
		
		System.out.println("== arr ==");
		for( int num: arr ) {
			
			System.out.println(num);
		}  // enhanced for
		
		System.out.println("== arrcopy ==");
		for( int num: arrcopy ) {
			
			System.out.println(num);
		}  // enhanced for
		
		arr[4] = 123;
		
		System.out.println("== arr ==");
		for( int num: arr ) {
			
			System.out.println(num);
		}  // enhanced for
		
		System.out.println("== arrcopy ==");
		for( int num: arrcopy ) {
			
			System.out.println(num);
		}  // enhanced for
		

	}

}
