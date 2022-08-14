package ch18;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\SO YU JEONG\\Desktop\\프로그래밍\\JAVA\\Chapter6\\newFile.txt");  // 파일은 없어도 만들어줌
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();  // 파일 삭제
	}
}