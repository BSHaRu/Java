package test8;

public class Test01 {

	public static void main(String[] args) {
		int i = 5;
		char c = 'A';
		float f = 3.14f;
		double d = 3.141592;
		boolean b = true;
		String s = "Hello";
		
		printArgInfo(i);
		printArgInfo(c);
		printArgInfo(f);
		printArgInfo(d);
		printArgInfo(b);
		printArgInfo(s);
	}

	private static <T> void printArgInfo(T arg) {
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString());
	}
	

}
