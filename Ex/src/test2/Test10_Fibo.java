package test2;

/*
 * 날짜 : 2023.06.15
 * 내용 : 자바 파보나치 수열 재귀 메서드 연습문제 
 */

public class Test10_Fibo {

	public static void main(String[] args) {

		for(int i=0; i < 10; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		// 이렇게 해버리면 파보나치가 파보나치를 호출해서
		// 파보나치 메소드가 무한루프가 됨
		// -> StackOverFlow가 뜨는거임
		// ∴ 최종 return은 if문에서 해야되는거임
//		return fibo(n) + fibo(n+1);
		return fibo(n-2) + fibo(n-1);
	}
	
}
