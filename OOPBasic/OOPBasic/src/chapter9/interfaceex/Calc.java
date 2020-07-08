package chapter9.interfaceex;

public interface Calc {
	double PI = 3.14; // 이테릭체로 public static final이 자동으로 추가됨.
	int ERROR = -99999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
}
