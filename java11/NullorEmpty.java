package java11;

public class NullorEmpty {
	public static void main(String[] args) {
		String value = "";
		String value1 = " ";
		String value2 = null;
		System.out.print(value.length());
		System.out.print(value);
		System.out.print(value1.length());
		System.out.print(value1);
		System.out.println(value2.length());
		System.out.println(value2);
		System.out.println("abc".compareToIgnoreCase("ABC"));
		byte[] bytes = "abcdef".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}
		System.out.println("javaphpjavapython".lastIndexOf("java"));

		String[] ymd = "1980-10-11".split("-");
		for (int s = 0; s < ymd.length; s++) {
			System.out.println(ymd[s]);
		}

		String param = "name=zhangsan&password=123&age=20";
		String[] params = param.split("&");
		for (int z = 0; z < params.length; z++) {
			System.out.println(params[z]);
		}
		//		            String[] params[z]=params.split("=");
		String str = "http://www.baidu.com".substring(7, 10);
		System.out.println(str);
		System.out.println("ABCDefKXyz".toLowerCase());
		System.out.println("           hello      world             ".trim());

		String d = " ";
		System.out.println(d.isEmpty());
		System.out.println("test.txt".endsWith("txt"));

		char[] chars = "我是中国人".toCharArray();
		for (int j = 0; j < chars.length; j++) {
			System.out.println(chars[j]);
		}
		char a = 'a';
		System.out.println(a);
		String s1 = String.valueOf(true);
		String s2 = String.valueOf(100);
		String s3 = String.valueOf(3.14);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//String s4 = String.valueOf(new Customer());
		System.out.println(s1);

	}
}
