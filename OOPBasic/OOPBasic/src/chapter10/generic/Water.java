package chapter10.generic;

public class Water extends Material{
	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("water로 프린팅 합니다.");
	}
}
