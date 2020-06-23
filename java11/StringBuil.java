package java11;

public class StringBuil {
	public static void main(String[] args) {
		String abc = "0" + 1 + 2 + "3"; // あまりよくない
		// 以下StringBuilderを用い、文字列を構築する
		StringBuilder sb = new StringBuilder();
		sb.append("0").append(1).append(2).append("3");
		String abc2 = sb.toString();
		System.out.println(abc);
		System.out.println(abc2);
	}

}
