package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		// stream 생성법
		System.out.println();
		Arrays.stream(arr).forEach(n->System.out.println(n));
		// 1. Stream 생성 : Arrays.stream(arr)
		// Arrays 클래스 : 모든 array는 이 클래스 활용 가능
		
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		// 한번 쓴 Stream(is)은 사용하면 재사용 불가
		
		System.out.println();
		// Stream 다시 생성 필요
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
}
}
