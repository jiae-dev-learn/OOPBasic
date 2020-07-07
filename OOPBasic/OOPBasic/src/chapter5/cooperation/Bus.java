package chapter5.cooperation;

public class Bus {
	private int busNumber;
	private int passengerCount;
	private int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		// ����
		this.money += money;
		passengerCount++;
	}

	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
