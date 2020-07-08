package chapter8.practice;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();	
	public abstract void startCar();
	public abstract void turnOff();

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
