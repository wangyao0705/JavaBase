package java11;

/**
 * @author user
 *
 */
public class Anima {
	int age;
	String name;
	String classify;

	public Anima(String name) {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		Anima cat = new Anima("a");
		System.out.println(cat.name);
		cat.sayHello();
	}
}
