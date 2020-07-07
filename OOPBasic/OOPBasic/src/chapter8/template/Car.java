package chapter8.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	//하위 클래스에서 정의했을 경우에만 수행
	public void washCar() {}
	
	// final 키워드로 재정의할 수 없도록 메서드를 정의
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}

}
