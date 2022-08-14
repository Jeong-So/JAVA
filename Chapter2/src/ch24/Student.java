package ch24;

import java.util.ArrayList;

public class Student {

	public int studentId;
	public String studentName; 
	int total = 0;
	ArrayList<Subject> subject;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		subject = new ArrayList<Subject>();
	}
	
	public void addSubject(String SubjectName, int SubjectScore) {		
		subject.add(new Subject(SubjectName, SubjectScore));
	}
	
	public void showStudentInfo() {
		for(Subject s : subject) {
			System.out.println("학생 "+ studentName + "의 " + s.getSubjectName() + " 과목 성적은 " + s.getSubjectScore()  + "점 입니다.");
			total += s.getSubjectScore();
		}
		System.out.println("학생 "+ studentName + "의 총점은 " + total  + "점 입니다.");
	}
	
}
