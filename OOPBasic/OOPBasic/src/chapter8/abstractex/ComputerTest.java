package chapter8.abstractex;

public class ComputerTest {
	public static void main(String[] args) {
		
		Computer desktop = new DeskTop();
		Computer myNoteBook = new MyNoteBook();
		
		desktop.display();
		myNoteBook.turnOff();
	}
}
