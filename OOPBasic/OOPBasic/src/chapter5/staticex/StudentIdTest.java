package chapter5.staticex;

public class StudentIdTest {
	public static void main(String[] args) {
		Student studentlee = new Student("Lee");
		System.out.println(Student.serialNum);
		Student studentkim = new Student("Kim");
		System.out.println(Student.serialNum);
		
		System.out.println(studentlee.getStudentId());
		System.out.println(studentkim.getStudentId());
		
	}
}
