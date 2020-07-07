package chapter5.thisex;

public class PersonTest {
	public static void main(String[] args) {
		Person personNoName = new Person();
		personNoName.showInfo();
		
		Person personLee = new Person("lee", 20);
		personLee.showInfo();
	}
}
