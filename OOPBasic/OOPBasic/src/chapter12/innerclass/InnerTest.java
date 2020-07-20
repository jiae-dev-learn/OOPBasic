package chapter12.innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 100;
//		static int sInNum = 200; // outClass 생성 후 inerClass가 생성되기 때문에 static키워드를 못붙임.

		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
//			System.out.println(inNum); //static이라 inNum 일반변수는 호출 불가
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		//문법적으로는 가능하지만 이렇게 밖에서 쓰려면 그냥 InnerClass를 밖에 생성하는게 맞음.
		OutClass.InClass myInClass = outClass.new InClass(); 
		myInClass.inTest();
		
		System.out.println();
		OutClass.InStaticClass.sTest();
	}
}
