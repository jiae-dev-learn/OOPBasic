package chapter9.sort;

public interface Sort {
	void asceding(int[] num);
	void descending(int[] num);
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
}
