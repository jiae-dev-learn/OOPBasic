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
		System.out.println("�ֹ� ��ȣ: "+orderNumber);
		System.out.println("�ֹ��� ���̵�: "+userId);
		System.out.println("�ֹ� ��¥: "+orderDate);
		System.out.println("�ֹ��� �̸�: "+userName);
		System.out.println("�ֹ� ��ǰ ��ȣ: "+orderProduct);
		System.out.println("��� �ּ�: "+address);
		
	}
	
	
}
