package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
//		for(int i = 0, num = 1; i < arr.length; i++ ) {
//			arr[i] = num++;
//			System.out.println(arr[i]);
//		}
		
		for( int num: arr ) {
			total += num;
			System.out.println("num : "+ num +" , arr : "+ arr);
			System.out.println(total);
		}  // enhanced for
		
		System.out.println(total);
		
	}

}
