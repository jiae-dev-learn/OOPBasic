package chapter8.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}

	//���� Ŭ�������� �������� ��쿡�� ����
	public void washCar() {}
	
	// final Ű����� �������� �� ������ �޼��带 ����
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
