package chapter12.lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		// 람다식으로 함수가 변수처럼 사용됨.
		StringConcat concat = (s, v) -> System.out.println(s+ "," + v);
		concat.makeString("hello", "world");
	}
}
