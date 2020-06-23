package java11;

public  class Test{
	public static void main (String [] args) {
		Test test = new Test();
		Animal a = new Animal("xixi");
		Cat c = new Cat ("Catname","blue");
		Dog d = new Dog ("Dogname","black");
		test.f(a);
		test.f(c);
		test.f(d);
		System.out.println(a instanceof Animal);
		System.out.println(c instanceof Animal);
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Cat);
		a = new Dog ("bigdog","yellow");
		System.out.println(a.name);
		//System.out.println(a.furColor);
		System.out.println(a instanceof Animal);
		System.out.println(a instanceof Dog);
		Dog d1 = (Dog) a ;
		System.out.println(d1.furColor);
	}
	public void f (Animal a ) {
		System.out.println("name"+a.name);
		if (a instanceof Cat) {
			Cat cat =(Cat) a;
			System.out.println(" "+cat.eyesColor + "eyes");
		}else if (a instanceof Dog) {
			Dog dog =(Dog) a;
			System.out.println(" "+dog.furColor + "fur");
		}
	}



}


