package chapter14.stream.coffee;

public abstract class Decorator extends Coffee{
	//��� �޼��尡 ������ �Ǿ�� ��ӿ����� Decorator Ŭ������ abstract�� ����.
	
	Coffee coffee;
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
		
	}
	@Override
	public void brewing() {
		coffee.brewing();
	}
}
