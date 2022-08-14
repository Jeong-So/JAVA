package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public Student() {}  // 2. main에 디폴트 생성자 만들기 위해서는 class에 디폴트 생성자 만들어야 함 (만약 클레스에 생성자 만들었을 시)
	
	public Student(int studentNumber, String studentName, int grade) { 
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;		
		
	}  // 1. 생성자를 직접 만든 것 , java는 컴파일 시 생성자가 없으면 디폴트 생성자를 자동으로 생성 함
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";
	}
	
	
}
