package chapter5.function;

public class FunctionTest {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int total = Function.addNum(num1, num2);
		
		Function.sayHello("안녕하세요");
		
		int num = Function.calcSum();
		
		System.out.println(total);
		System.out.println(num);
	}
}
