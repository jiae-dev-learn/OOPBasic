package chapter12.lambda;

public class TestMyNumber {
	public static void main(String[] args) {
		//두개 변수가 넘어 왔을 떄 더 큰수를 반환해라. 람다식을 사용할때는 가능하면 간단하게 쓴다.
		MyMaxNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMaxNumber(10,  20));
		
	}
}
