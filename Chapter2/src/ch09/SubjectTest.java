package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 80);
		
		
		Student studentKim = new Student(200, "Kim");
		studentKim.setKoreaSubject("����",70);
		studentKim.setMathSubject("����", 96);
	
		studentLee.showScoreInfo();
		studentKim.showScoreInfo();
		
	
	}

}
