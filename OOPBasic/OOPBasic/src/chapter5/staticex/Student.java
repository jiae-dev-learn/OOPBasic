package chapter5.staticex;

public class Student {
	
	public static int serialNum = 1000;
	private int studentId;
	private String studentName;
	private String address;
	
	public Student(String name) {
		this.studentName = name;
		Student.serialNum ++;
		studentId = serialNum;
	}
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		this.address = "주소 없음";
		Student.serialNum++;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
}
