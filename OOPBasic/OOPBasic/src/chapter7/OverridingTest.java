package chapter7;

public class OverridingTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerId(10010);
		customerLee.setBonusPoint(1000);
		int priceLee = customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + "���� �ݾ��� "+priceLee + "�� �Դϴ�.");
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerId(10020);
		customerKim.setBonusPoint(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo() + "���� �ݾ��� "+priceKim + "�� �Դϴ�.");
		
	}
}
