package chapter12.innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnuble(final int i) { // innerclass의 지역변수는 final로 선언
		final int num = 100; // 지역변수는 final로 선언 (그냥 선언해도 final이 붙음)
		class MyRunnuble implements Runnable{
			
			@Override
			public void run() {
//				num += 10; //innerclass의 지역변수는 값을 변경할 수 없음.
//				i = 200;
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		}
		return new MyRunnuble();
	}
}
public class LocalInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnuble(50);
		
		runnable.run();
	}
}
