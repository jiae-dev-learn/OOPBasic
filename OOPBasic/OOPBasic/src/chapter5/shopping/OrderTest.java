package chapter5.shopping;

public class OrderTest {
	
	public static void main(String[] args) {
		Order order = new Order();
		order.order("20180312001", "abc123", "2018�� 3�� 12��", "ȫ�浿", "PD345-12", "����� �������� ���ǵ��� 20����");
		order.showOrder();
	}
}
