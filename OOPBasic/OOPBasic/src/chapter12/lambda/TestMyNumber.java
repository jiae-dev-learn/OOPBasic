package chapter12.lambda;

public class TestMyNumber {
	public static void main(String[] args) {
		//�ΰ� ������ �Ѿ� ���� �� �� ū���� ��ȯ�ض�. ���ٽ��� ����Ҷ��� �����ϸ� �����ϰ� ����.
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMaxNumber(10,  20));
		
	}
}
