package chapter6.array;

public class ArrayTest {
	public static void main(String[] args) {
//		int[] arr1 = new int[10];
//		int[] arr2 = new int[] {1,2,3};
//		int[] arr3 = {1,2,3};
		
		int[] arr = new int[10];
		int total = 0;
		for (int i=0, num=1; i<arr.length; i++, num++) {
			arr[i] = num;
			total += arr[i];
		}
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(total);
	}
}
