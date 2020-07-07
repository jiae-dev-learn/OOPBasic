package chapter5.cooperation;

public class Taxi {
	private int carNumber;
	private int passengerCount;
	private int money;
	
	public Taxi(int carNumber) {
		this.carNumber = carNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(carNumber + "�� �ý��� �Ϸ� �°��� "+passengerCount + "�� �̰�, ������ "+money + "�Դϴ�.");
	}
}
