package dc007;

public class Girl {

	//属性
	public String colour;
	public int age;
	public String nationality;
	public String hairColour;
	//アクション
	//s
	public void s() {
		System.out.println("s");
	}
	//eat
	public void eat () {
		System.out.println("eat,eat,eat,eat..........");
	}

	Girl (int aage,String colours){
			age =aage;
			colour=colours;
		}
	public static void main (String[]args) {
		Girl a=new Girl(12,"black");
		System.out.println(a.colour);
	}
	}





