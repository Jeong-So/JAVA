package ch22;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3,},{1,2,3,4}};
		
		int i,j;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println("\n" + arr[i].length);
		}
		System.out.println("행 길이 : " + arr.length + ", 열 길이 : "+ arr[1].length);
		
	}

}
