package chapter5.reference;

public class StudentTest {
	public static void main(String[] args) {
		Student jiae = new Student(1003, "±èÁö¾Ö");
		jiae.setKoreaSubject(100);
		jiae.setMathSubject(80);
		jiae.showStudentInfo();
	}
}
