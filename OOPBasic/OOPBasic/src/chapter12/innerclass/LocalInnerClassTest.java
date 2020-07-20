package chapter12.innerclass;

class Outer {
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnuble(final int i) { // innerclass�� ���������� final�� ����
		final int num = 100; // ���������� final�� ���� (�׳� �����ص� final�� ����)
		class MyRunnuble implements Runnable{
			
			@Override
			public void run() {
//				num += 10; //innerclass�� ���������� ���� ������ �� ����.
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
