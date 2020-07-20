package chapter12.innerclass;

class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	Runnable getRunnuble(final int i) { // innerclass의 지역변수는 final로 선언
		final int num = 100; // 지역변수는 final로 선언 (그냥 선언해도 final이 붙음)
		
		//MyRunnuble은 이 안에서 단 한번만 사용되기 때문에 클래스 이름이 그다지 필요가 없음.
		return new Runnable(){
			
			@Override
			public void run() {
//				num += 10; //innerclass의 지역변수는 값을 변경할 수 없음.
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
