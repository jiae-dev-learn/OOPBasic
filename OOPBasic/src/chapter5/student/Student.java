package chapter5.student;

public class Student {
	private int studentId;
	private String studentName;
	private String address;
	
	public Student(int id, String name, String address) {
		this.studentId = id;
		this.studentName = name;
		this.address = address;
	}
	public void showStudentInfo() {
		System.out.println("학생 이름: "+ studentName);
		System.out.println("학생 아이디: "+ studentId);
		System.out.println("학생 주소: "+ address);
	}
	
		
}
