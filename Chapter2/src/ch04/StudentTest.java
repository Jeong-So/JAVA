package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		
		studentLee.studentId = 12345;
		studentLee.studentName = "Lee";
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		studentLee.setStudentName("So");
		studentLee.showStudentInfo();
		
		String name = studentLee.getStudentName();
		System.out.println(name);
		
		Student studentKim = new Student();
		studentKim.studentId = 54321;
		studentKim.setStudentName("Kim");
		studentKim.address = "경기도 성남시";
		
		studentKim.showStudentInfo();
		 
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
