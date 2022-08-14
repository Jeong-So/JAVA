package ch24;

public class Subject {
	
	private String SubjectName;
	private int SubjectScore;
	
	public Subject(String SubjectName, int SubjectScore) {
		this.SubjectName = SubjectName;
		this.SubjectScore = SubjectScore;
	}
	
	public String getSubjectName() {
		return SubjectName;
	}
	
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public void setSubjectScore(int subjectScore) {
		SubjectScore = subjectScore;
	}

	public int getSubjectScore() {
		return SubjectScore;
	}
	

}
