package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		// # 1 깨짐
//		try(FileInputStream fis = new FileInputStream("reader.txt")){
//			int i;
//			
//			while((i = fis.read()) != -1) {
//				System.out.print((char)i);				
//			};
//			
//		}catch(IOException e) {
//			
//		}

		// # 2 보조스트림(InputStreamReader로 FileInputStream 감쌈  // inputstream이면 다 감쌀 수 있음, 문자로 바꿔줌
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))){  
			int i;
			
			while((i = isr.read()) != -1) {
				System.out.print((char)i);				
			};
			
		}catch(IOException e) {
			
		}
		
		
	}

}
