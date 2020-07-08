package chapter9.interfaceex;

public interface Calc {
	double PI = 3.14; // 이테릭체로 public static final이 자동으로 추가됨.
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);

	default void description() {
		System.out.println("점수 계산기를 구현합니다.");
//		myMethod();
	}
	
	/*
	 * array의 합을 계산해서 반환하는 메서드
	 * 추상메서드로만 제공이 되면 각각 구현을 해야 하고 default로 제공되면 인스턴스를 생성해서 만들어야 함.
	 * 따라서 인스턴스를 생성하지 않고 유틸처럼 사용할 수 있는 기능은 인터페이스에서도 static으로 제공할 수 있음.
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
	 * private 메서드는 java9부터 제공한다.
	 * 사용할 경우 JRE 버전을 확인한다.
	 * 현재 1.8(무료)을 사용하고 있으므로 실습은 넘어간다.
	 */
//	private void myMethod() {
//		System.out.println("private 메서드");
//	}
	
//	private static void mystaticMethod() {
//		System.out.println("private static method");
//	}
}
