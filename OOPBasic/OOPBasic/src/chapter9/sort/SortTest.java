package chapter9.sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		initMessage();
		int ch = System.in.read();
		int num[] = {1,2,3,4,5};
		Sort sort = null;
		switch (ch) {
		case 'Q':
		case 'q':
			sort = new QuickSort();
			break;
		case 'H':
		case 'h':
			sort = new HeapSort();
			break;
		case 'B':
		case 'b':
			sort = new BubbleSort();
			break;
		default:
			System.out.println("지원하지 않는 기능입니다.");
			break;
		}
		if (sort != null) {
			runSortAll(sort, num);
		}
	}

	private static void initMessage() {
		System.out.println("정렬 방식을 선택하세요.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
	}
	
	private static void runSortAll(Sort sort, int[] num) {
		sort.asceding(num);
		sort.descending(num);
		sort.description();
	}
}
