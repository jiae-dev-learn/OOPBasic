package chapter5.reference;

public class Subject {
	String subjectName;
	int score;
	
	public Subject(String subjectName, int score) {
		this.subjectName = subjectName;
		this.score = score;
	}
	
	public void showSubjectInfo() {
		System.out.println("-------------------------");
		System.out.println("���� ��: " + this.subjectName);
		System.out.println("����: " + this.score);
	}
	
}
