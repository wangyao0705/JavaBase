package java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listto {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("user");
		String[] datas = list.toArray(new String[0]);
		System.out.println(Arrays.toString(datas));
		System.out.println(list.indexOf("user"));
		System.out.println(list.contains("user1"));
		System.out.println(list.indexOf("user1"));
		System.out.println(datas);
		String[] data = new String[] { "s1", "s2", "s3" };
		List<String> lists = Arrays.asList(data);
		System.out.println(lists);
	}
}
