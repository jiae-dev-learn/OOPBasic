package chapter7.polymorphism;

import java.util.ArrayList;import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBooks() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� �ö󰩴ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
//		if(hAnimal instanceof Human){
////			Eagle human = (Eagle)hAnimal;
////			human.flying();
//			Human human = (Human)hAnimal;
//			human.readBooks();
//		}
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
//		for(Animal animal : animalList) {
//			animal.move();
//		}
		
		AnimalTest animalTest = new AnimalTest();
		animalTest.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> animalList) {
		for (Animal animal : animalList) {
			if (animal instanceof Human) {
				((Human) animal).readBooks();
			} else if (animal instanceof Tiger) {
				((Tiger) animal).hunting();
			} else if (animal instanceof Eagle) {
				((Eagle) animal).flying();
			} else {
				System.out.println("Error");
			}
		}		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}


