package java11;

import java.util.Arrays;
import java.util.List;

public class Tolist {
	public static void main(String[] args) {
		String[] datas = new String[] { "item1", "item2", "item3" };
		List<String> list = Arrays.asList(datas);
		System.out.println(list);
	}

}
