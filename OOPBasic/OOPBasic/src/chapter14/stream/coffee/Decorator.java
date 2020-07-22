package chapter14.stream.coffee;

public abstract class Decorator extends Coffee{
	//모든 메서드가 구현이 되었어도 상속용으로 Decorator 클래스를 abstract로 만듦.
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
		
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}
}
