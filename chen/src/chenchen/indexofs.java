package chenchen;

public class indexofs {

	public static void main(String[] args) {
		String str = ("aabbccdd");
		System.out.println(str.indexOf("b"));
		System.out.println(str.lastIndexOf("c"));
		System.out.println(str.substring(str.indexOf("b"),str.lastIndexOf("c")+1));
		System.out.println(str.contains("z"));
	}

}
