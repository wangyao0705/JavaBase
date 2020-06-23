package java11;

public class Kicker {
	/*public static void main(String[] args) {
		Child c = new Child ();
		c.hello();
	}*/
	public static void print(Parent v) {
		v.hello();
	}

	public static void main(String[] args) {
		print(new Parent());
		print(new Child());
	}
}
