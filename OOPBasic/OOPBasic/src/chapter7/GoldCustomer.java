package chapter7;

public class GoldCustomer extends Customer{	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	private double salesRatio;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
