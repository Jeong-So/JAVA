package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		// # 1 : 시간 소요가 많이 됨 (소요시간: 234)
		// fis에서 읽어서 fos에 쓰게 함
//		try(FileInputStream fis = new FileInputStream("a.zip");
//				FileOutputStream fos = new FileOutputStream("copy.zip")){
//			
//			millisecond = System.currentTimeMillis();
//			
//			int i;
//			while((i = fis.read()) != -1) {
//				fos.write(i);
//			}
//			
//			millisecond = System.currentTimeMillis() - millisecond;
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(millisecond + " 소요되었습니다.");

		
		// # 2 : BufferedInputStream/ BufferedOutputStream 보조스트림 사용  (소요시간: 1)
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(millisecond + " 소요되었습니다.");
		
		
		// # 3 보조스트림 BufferReader
		
		Socket socket = new Socket();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			br.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// socket.getInputStream().read() : byte단위로만 처리되어 영어로만 해야함
		// (new InputStreamReader(socket.getInputStream()) : new InputStreamReader로 감싸면 한글로 처리 가능 (문자처리)
		// new BufferReader : 속도를 더 빠르게 하기 위하여 사용
		// 보조스트림이 다른 보조스트림을 계속 감싸서 최종 기반 스트림을 감싸서 사용
			
	}
	
}
