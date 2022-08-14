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
			System.out.println("�л� "+ studentName + "�� " + s.getSubjectName() + " ���� ������ " + s.getSubjectScore()  + "�� �Դϴ�.");
			total += s.getSubjectScore();
		}
		System.out.println("�л� "+ studentName + "�� ������ " + total  + "�� �Դϴ�.");
	}
	
}
