package chapter12.lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		// ���ٽ����� �Լ��� ����ó�� ����.
		StringConcat concat = (s, v) -> System.out.println(s+ "," + v);
		concat.makeString("hello", "world");
	}
}
