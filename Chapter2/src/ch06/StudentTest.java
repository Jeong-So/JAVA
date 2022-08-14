package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		// 2. new Student();  <-- 디폴트 생성자
		// 디폴트 생성자가 제공되는 경우 : 클래스에 생성자가 하나도 없는 경우 --> 컴파일러가 컴파일 될 때 class에 디폴트 생성자 자동으로 만듬
		// class에 생성자를 직접만든 경우는 디폴트 생성자 제공안됨 , 디폴트 생성자 쓰고 싶은 경우 class에 디폴트 생성자 만들어야함
		// 생성자 오버로딩
		
		
		Student studentLee = new Student(1234,"LEE", 12); 
		// 1. class에서 만든 생성자에 매개변수 넣어서 인스턴스 생성
		
		System.out.println(studentKim.showStudentInfo());
		System.out.println(studentLee.showStudentInfo());
		
	}

}
