package chapter10.generic;

public class Water extends Material{
	@Override
	public String toString() {
		return "���� �ö�ƽ�Դϴ�.";
	}

	@Override
	public void doPrinting() {
		System.out.println("water�� ������ �մϴ�.");
	}
}
