package java11;

public class Stringformat {
	public static void main(String[] args) {
		int one = 123456;
		float two = 123456789.33333f;
		System.out.println(String.format("%,d two = %,2f", one, two));
		System.out.println(String.format("%,d two = %,.2f", one, two));
		System.out.println(String.format("%05d", 4));
	}

}
