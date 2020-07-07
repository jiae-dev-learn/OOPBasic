package chapter7;

public class OverridingTest {
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		customerLee.setBonusPoint(1000);
		int priceLee = customerLee.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 "+priceLee + "원 입니다.");
		
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.setBonusPoint(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 "+priceKim + "원 입니다.");
		
	}
}
