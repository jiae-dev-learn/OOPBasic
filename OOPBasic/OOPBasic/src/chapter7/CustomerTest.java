package chapter7;

public class CustomerTest {
	public static void main(String[] args) {
		/*
		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerId(10010);
		customerLee.setBonusPoint(1000);
		
		System.out.println(customerLee.showCustomerInfo());
		*/
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerId(10020);
		customerKim.setBonusPoint(10000);
		
		System.out.println(customerKim.showCustomerInfo());
	}
}
