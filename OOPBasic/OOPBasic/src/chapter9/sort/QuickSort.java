package chapter9.sort;

public class QuickSort implements Sort{

	@Override
	public void asceding(int[] num) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] num) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSoft ¿‘¥œ¥Ÿ.");		
	}

}
