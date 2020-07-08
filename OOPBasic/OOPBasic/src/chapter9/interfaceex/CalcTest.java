package chapter9.interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc(); 
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));

		/*
		 *  인터페이스를 구현한 클래스라고 하더라도
		 *  인터페이스에 포함되지 않은  추가된 메서드는 사용할 수 없다. 
		 */
		//calc.showInfo();
		calc.description();
		int[] arr = {1,2,3,4,5};
		System.out.println("배열의 합은 "+Calc.total(arr)+"입니다.");
	}

}
