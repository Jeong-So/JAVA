package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

// 입출력 클래스 중 유일하게 파일에 대한 입출력 동시에 가능한 클래스
public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");  // file 없으면 만들어줌
		
		rf.writeInt(100);  // 4byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeDouble(3.14);  // 8byte
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		rf.writeUTF("안녕하세요");  // 한글(3byte) 3*5 + 2(null문자)
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
	
		rf.seek(0);  // 파일 포인터 움직임 (seek(0) : 맨 앞으로
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
	
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}