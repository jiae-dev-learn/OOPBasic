package chapter5.reference;

public class Student {
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
	}
	public void showStudentInfo() {
		System.out.println("�л� �̸�: " + studentName);
		System.out.println("�л� ���̵�: " + studentId);
		korea.showSubjectInfo();
		math.showSubjectInfo();
	}
	
	public void setKoreaSubject(int score) {
		korea = new Subject("����", score);
	}

	public void setMathSubject(int score) {
		math = new Subject("����", score);
	}
}
