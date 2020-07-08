package chapter9.interfaceex;

public interface Calc {
	double PI = 3.14; // ���׸�ü�� public static final�� �ڵ����� �߰���.
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
//		myMethod();
	}
	
	/*
	 * array�� ���� ����ؼ� ��ȯ�ϴ� �޼���
	 * �߻�޼���θ� ������ �Ǹ� ���� ������ �ؾ� �ϰ� default�� �����Ǹ� �ν��Ͻ��� �����ؼ� ������ ��.
	 * ���� �ν��Ͻ��� �������� �ʰ� ��ƿó�� ����� �� �ִ� ����� �������̽������� static���� ������ �� ����.
	 */
	static int total(int[] arr){
		int total = 0;
		
		for(int i: arr) {
			total += i;
		}
//		mystaticMethod();
		return total;
	}
	
	/*
	 * private �޼���� java9���� �����Ѵ�.
	 * ����� ��� JRE ������ Ȯ���Ѵ�.
	 * ���� 1.8(����)�� ����ϰ� �����Ƿ� �ǽ��� �Ѿ��.
	 */
//	private void myMethod() {
//		System.out.println("private �޼���");
//	}
	
//	private static void mystaticMethod() {
//		System.out.println("private static method");
//	}
}
