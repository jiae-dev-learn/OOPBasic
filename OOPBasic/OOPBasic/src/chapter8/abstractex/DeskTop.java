package chapter8.abstractex;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");	
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

}
