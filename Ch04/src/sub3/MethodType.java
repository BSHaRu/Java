package sub3;

/*
 * 날짜 : 2023.06.15
 * 내용 : Java 메서드 형태 실습
 * 
 */
public class MethodType {

	public static void main(String[] args) {

		// 형태 1
		double r1 = type1(1.1);
		System.out.println("r1 : " + r1);
		
		double r2 = type1(2.1);
		System.out.println("r2 : " + r2);
		
		System.out.println("--------------------------");

		// 형태 2
		// 리턴값이 없기 때문에 대입연산자(=)를 안쓰는거임
		type2(true);
		type2(false);
		
		System.out.println("--------------------------");
		
		// 형태 3 매개변수는 있지만 리턴값이 없는 경우
		boolean r3 = type3();
		System.out.println("type3의 r3 : " +r3);
		
		System.out.println("--------------------------");
		
		// 형태 4
		type4();
		
	} // main end
	
	// 형태 1 : 매개변수o, 리턴값 o
	public static double type1(double x) {
		
		double y = x + 3.14;
		return y;
	}
	
	// 형태 2 : 매개변수o, 리턴값 x
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
	}
	
	// 형태 3 : 매개변수x, 리턴값 o
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	// 형태 4 : 매개변수x, 리턴값 x
	public static void type4() {
		double result = type1(0.3);
		System.out.println("type4 실행결과 : " + result);
	}
	
}
