package chapter9.sort;

public interface Sort {
	void asceding(int[] num);
	void descending(int[] num);
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
