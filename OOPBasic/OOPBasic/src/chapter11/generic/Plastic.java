package chapter11.generic;

public class Plastic extends Material{
	@Override
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic으로 프린팅 합니다.");
	}
	
	
}
