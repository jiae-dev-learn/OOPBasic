package chapter11.generic;

public class Powder extends Material{
	@Override
	public String toString() {
		return "재료는 파우더 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder로 프린팅 합니다.");
	}
	
}
