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
		System.out.println("학생 이름: " + studentName);
		System.out.println("학생 아이디: " + studentId);
		korea.showSubjectInfo();
		math.showSubjectInfo();
	}
	
	public void setKoreaSubject(int score) {
		korea = new Subject("국어", score);
	}

	public void setMathSubject(int score) {
		math = new Subject("수학", score);
	}
}
