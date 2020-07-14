package chapter10.string;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc"); //Allocation in Heap memory
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		
		String str3 = "abc"; // Value of constant pool
		String str4 = "abc";
		
		System.out.println(str3 == str4);
	}
}
