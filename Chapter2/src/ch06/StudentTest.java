package ch06;

public class StudentTest {

	public static void main(String[] args) {

		Student studentKim = new Student();
		// 2. new Student();  <-- ����Ʈ ������
		// ����Ʈ �����ڰ� �����Ǵ� ��� : Ŭ������ �����ڰ� �ϳ��� ���� ��� --> �����Ϸ��� ������ �� �� class�� ����Ʈ ������ �ڵ����� ����
		// class�� �����ڸ� �������� ���� ����Ʈ ������ �����ȵ� , ����Ʈ ������ ���� ���� ��� class�� ����Ʈ ������ ��������
		// ������ �����ε�
		
		
		Student studentLee = new Student(1234,"LEE", 12); 
		// 1. class���� ���� �����ڿ� �Ű����� �־ �ν��Ͻ� ����
		
		System.out.println(studentKim.showStudentInfo());
		System.out.println(studentLee.showStudentInfo());
		
	}

}
