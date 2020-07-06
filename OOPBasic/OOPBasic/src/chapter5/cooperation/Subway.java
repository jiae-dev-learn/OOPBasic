package chapter5.cooperation;

public class Subway {
	private int lineNumber;
	private int passengerCount;
	private int money;

	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showSubwayInfo() {
		System.out.println(lineNumber + "�� ����ö�� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�� �Դϴ�.");
	}
}
