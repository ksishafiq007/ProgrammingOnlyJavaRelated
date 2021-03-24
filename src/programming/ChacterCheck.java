package programming;

public class ChacterCheck {
	
	private static void doStuff(String str) {
		int var =4;
		if(var==str.length()) {
			System.out.println(str.charAt(--var)+"");
		}else {
			System.out.println(str.charAt(0)+"");
		}
	}

	public static void main(String[] args) {
		doStuff("mnop");
		doStuff("xyz");
		doStuff("hello");
	}

}
