package sub4;

/*
 * 날짜 : 2023.06.27
 * 내용 : Java Math 클래스 실습
 * 
 */

public class MathTest {

	public static void main(String[] args) {
		
		// Math.ceil(올림), Math.floor(내림)은 많이쓴다네
		
		System.out.println("절대값 : " + Math.abs(-9));
		System.out.println("제곱근 : " + Math.sqrt(9));
		System.out.println("올림값1 : " + Math.ceil(1.2));
		System.out.println("올림값2 : " + Math.ceil(1.8));
		System.out.println("내림값1 : " + Math.floor(1.2));
		System.out.println("내림값2 : " + Math.floor(1.8));
		System.out.println("반올림1 : " + Math.round(1.2));
		System.out.println("반올림2 : " + Math.round(1.8));
		
		System.out.println();
		
		// random : 0.0~1.0 무작위 실수 나옴
		double num1 = Math.random();
		System.out.println("num1 : " + num1);
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2);
		
		int num3 = (int) Math.ceil(num2);
		System.out.println("num3 : " + num3);
		
		// 1 ~ 45 사이의 임의의 정수
		int rand = (int) Math.ceil(Math.random() * 45);
		System.out.println("rand : " + rand);
	}

}
