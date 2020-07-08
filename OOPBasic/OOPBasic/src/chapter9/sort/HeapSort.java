package chapter9.sort;

public class HeapSort implements Sort{

	@Override
	public void asceding(int[] num) {
		System.out.println("HeapSoft ascending");
	}

	@Override
	public void descending(int[] num) {
		System.out.println("HeapSoft descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSoft ¿‘¥œ¥Ÿ.");
	}

}
