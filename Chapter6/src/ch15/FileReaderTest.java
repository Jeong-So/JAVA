package ch15;

import java.io.FileReader;  // 문자를 읽을때 사용하는 사용  (FileInputStream은 문자를 읽을 수 없음)
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("reader.txt")) {
			
			int i;
			
			while((i = fr.read()) != -1) {
				System.out.print((char)i);				
			};
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
