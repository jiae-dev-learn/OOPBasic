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
//		static int sInNum = 200; // outClass ���� �� inerClass�� �����Ǳ� ������ staticŰ���带 ������.

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
//			System.out.println(inNum); //static�̶� inNum �Ϲݺ����� ȣ�� �Ұ�
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}
public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		//���������δ� ���������� �̷��� �ۿ��� ������ �׳� InnerClass�� �ۿ� �����ϴ°� ����.
		OutClass.InClass myInClass = outClass.new InClass(); 
		myInClass.inTest();
		
		System.out.println();
		OutClass.InStaticClass.sTest();
	}
}
