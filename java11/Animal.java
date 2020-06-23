package java11;

public class Animal {
	public String name;
	public Animal(String name) {
		this. name = name;
	}
}
class Cat extends Animal{
	public String eyesColor;
	public Cat (String n,String c) {
		super(n);
		eyesColor = c;
	}
}
class Dog extends Animal{
	public String furColor;
	public Dog (String n,String c) {
		super(n);
		furColor=c;

	}
}