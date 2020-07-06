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
		System.out.println(carNumber + "번 택시의 하루 승객은 "+passengerCount + "명 이고, 수입은 "+money + "입니다.");
	}
}
