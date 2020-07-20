package chapter12.lambda;

//함수형 인터페이스 선언 (메서드를 두개 이상 선언 불가능)
@FunctionalInterface
public interface MyMaxNumber {
	int getMaxNumber(int x, int y);
}
