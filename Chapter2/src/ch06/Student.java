package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade;
	
	
	public Student() {}  // 2. main�� ����Ʈ ������ ����� ���ؼ��� class�� ����Ʈ ������ ������ �� (���� Ŭ������ ������ ������� ��)
	
	public Student(int studentNumber, String studentName, int grade) { 
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;		
		
	}  // 1. �����ڸ� ���� ���� �� , java�� ������ �� �����ڰ� ������ ����Ʈ �����ڸ� �ڵ����� ���� ��
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й��� " + studentNumber + "�̰�, " + grade + "�г� �Դϴ�.";
	}
	
	
}
