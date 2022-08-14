package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10];
			
			// # 1
//			System.out.println("Type 1 : 남아있는 버퍼까지 출력");
//			while( ( i = fis.read(bs)) != -1 ) {
//				for(int ch :bs) {
//					System.out.print((char)ch);
//				}
//				System.out.println(" : " + i + "바이트 읽음");
//			}
			
			// # 2
			System.out.println("Type 2");
			while( ( i = fis.read(bs, 1, 9)) != -1 ) {
				for(int j = 0; j < i ; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i + "바이트 읽음");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");

	}

}
