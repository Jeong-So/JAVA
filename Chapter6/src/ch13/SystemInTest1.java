package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			// # 1
//			while((i = System.in.read()) != '\n') {  // System.in 은 한 byte 밖에 못읽어서 한글 처리 안됨 (보조 스트림 사용해아함)
////			System.out.println(i);
//			System.out.print((char)i);
			
			// # 2
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {  // InputStreamReader을 통한 한글 처리
//			System.out.println(i);
			System.out.print((char)i);
			
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
