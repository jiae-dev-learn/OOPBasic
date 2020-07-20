package chapter12.innerclass;

class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnuble(final int i) { // innerclass�� ���������� final�� ����
		final int num = 100; // ���������� final�� ���� (�׳� �����ص� final�� ����)
		
		//MyRunnuble�� �� �ȿ��� �� �ѹ��� ���Ǳ� ������ Ŭ���� �̸��� �״��� �ʿ䰡 ����.
		return new Runnable(){
			
			@Override
			public void run() {
//				num += 10; //innerclass�� ���������� ���� ������ �� ����.
//				i = 200;
				System.out.println(outNum);
				System.out.println(Outer.sNum);
			}
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {
	public static void main(String[] args) {
		Outer2 outer = new Outer2();
		outer.runner.run();
		Runnable runnable = outer.getRunnuble(50);
		
		runnable.run();
		
	}
}
