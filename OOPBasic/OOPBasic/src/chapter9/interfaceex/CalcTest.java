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
		 *  �������̽��� ������ Ŭ������� �ϴ���
		 *  �������̽��� ���Ե��� ����  �߰��� �޼���� ����� �� ����. 
		 */
		//calc.showInfo();
		calc.description();
		int[] arr = {1,2,3,4,5};
		System.out.println("�迭�� ���� "+Calc.total(arr)+"�Դϴ�.");
	}

}
