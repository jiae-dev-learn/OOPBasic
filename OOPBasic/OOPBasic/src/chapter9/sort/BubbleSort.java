package chapter9.sort;

public class BubbleSort implements Sort{

	@Override
	public void asceding(int[] num) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] num) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort ¿‘¥œ¥Ÿ.");
	}

}
