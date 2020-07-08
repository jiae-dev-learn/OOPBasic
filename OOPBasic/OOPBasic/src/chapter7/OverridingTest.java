package chapter7;

public class OverridingTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		customerLee.setBonusPoint(1000);
		int priceLee = customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 "+priceLee + "원 입니다.");
		
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.setBonusPoint(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 "+priceKim + "원 입니다.");
		
	}
}
