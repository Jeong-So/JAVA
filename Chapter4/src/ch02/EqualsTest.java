package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;
		
		System.out.println(std1 == std2);
		System.out.println(std1.equals(std2)); // equals 오버라이딩
		System.out.println(std1.equals(std3));
		
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());  // hashcode 오버라이딩
		
		System.out.println(System.identityHashCode(std1));  // 실제 hashcode 값 출력
		System.out.println(System.identityHashCode(std2));
		System.out.println(System.identityHashCode(std3));
		
		
//		std1.setStudentName("Kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
		std1.setStudentName("Kim");
		System.out.println(std1);
		System.out.println(copyStudent);
		
		System.out.println();
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println();
		
		Integer i = 100;
		System.out.println(i.hashCode());
	}

}
