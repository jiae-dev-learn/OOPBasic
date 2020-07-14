package chapter10.object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			return (this.studentNum == std.studentNum);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		/***** student *****/
		Student lee = new Student(100, "이순신");
		Student lee2 = lee;
		Student shin = new Student(100, "이순신");

		System.out.println(lee==lee2);
		System.out.println(lee==shin);
		System.out.println(lee.equals(shin));
		
		System.out.println(lee.hashCode());
		System.out.println(shin.hashCode());
		
		/***** integer ******/		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
	}
}
