package chapter5.person;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(40);
		person.setMarried(true);
		person.setName("James");
		person.setNumberOfChildren(3);

		System.out.println("�̸�: "+person.getName());
		System.out.println("����: "+ person.getAge());
		System.out.println("��ȥ ����: "+person.getMerried());
		System.out.println("�ڽ�: "+person.getNumberOfChildren());

	}
}
