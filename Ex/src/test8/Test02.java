package test8;

// 함수형 인터페이스임을 컴파일러에게 알려주는 어노테이션
// -> 해당 인터페이스가 2개 이상의 추상메서드를 가지면 컴파일 오류
// ※ 함수형 인터페이스 
// 	- 단 하나의 추상 메서드만 가지고 있는 인터페이스
@FunctionalInterface
interface NumericLambda{
	boolean test(int n);
}

public class Test02 {

	public static void main(String[] args) {
		// 매개변수 n을 받고 그 값을 boolean으로 반환해야됨
		// 여기서는 test에 들어간 n의 값이 짝수인지 아닌지 확인
		// => 매개변수 n이 n % 2 == 0;의 값으로 boolean하는거임
		NumericLambda isEven = n -> n % 2 == 0; 
		
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		// 여기 test n은 음수인지 아닌지 확인
		// => 매개변수 : (n) | boolean test : n >= 0;
		NumericLambda isNonNeg = n -> n >= 0;
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		if(!isNonNeg.test(-1)) {
			System.out.println("-1은 음수");
		}
	}
}
