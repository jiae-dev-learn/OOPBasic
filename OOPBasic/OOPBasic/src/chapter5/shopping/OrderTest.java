package chapter5.shopping;

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		order.order("20180312001", "abc123", "2018년 3월 12일", "홍길동", "PD345-12", "서울시 영등포구 여의도동 20번지");
		order.showOrder();
	}
}
