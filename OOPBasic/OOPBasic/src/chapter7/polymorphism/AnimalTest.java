package chapter7.polymorphism;

import java.util.ArrayList;import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 올라갑니다.");
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


