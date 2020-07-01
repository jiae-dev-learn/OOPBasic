package chapter5.person;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(40);
		person.setMarried(true);
		person.setName("James");
		person.setNumberOfChildren(3);

		System.out.println("이름: "+person.getName());
		System.out.println("나이: "+ person.getAge());
		System.out.println("결혼 여부: "+person.getMerried());
		System.out.println("자식: "+person.getNumberOfChildren());

	}
}
