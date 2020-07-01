package chapter5.shopping;

public class Order {
	private String orderNumber;
	private String userId;
	private String orderDate;
	private String userName;
	private String orderProduct;
	private String address;

	
	public void order(String orderNumber, String userId, String orderDate, String userName, String orderProduct, String address) {
		this.orderNumber = orderNumber;
		this.userId = userId;
		this.userName = userName;
		this.orderDate = orderDate;
		this.orderProduct = orderProduct;
		this.address = address;	
	}
	
	public void showOrder() {
		System.out.println("주문 번호: "+orderNumber);
		System.out.println("주문자 아이디: "+userId);
		System.out.println("주문 날짜: "+orderDate);
		System.out.println("주문자 이름: "+userName);
		System.out.println("주문 상품 번호: "+orderProduct);
		System.out.println("배송 주소: "+address);
		
	}
	
	
}
