package chapter5.person;

public class Person {
	private int age;
	private String name;
	private boolean isMarried;
	private int numberOfChildren;
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	
	public boolean getMerried() {
		return isMarried;
	}
	
}
