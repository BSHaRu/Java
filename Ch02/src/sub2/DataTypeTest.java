package sub2;

/*
 * 날짜 : 2023.06.12
 * 내용 : Java 자료형 실습하기
 * 
 * 자료형(Date Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(객체)으로 나뉨
 */

public class DataTypeTest {
	public static void main(String[] args) {
		
		// 정수형 
		byte  num1 = 127; 			 	  // -128 ~ 127
		short num2 = 32767; 	 		  // 2byte
		int   num3 = 2147483647;		  // 4byte
		long  num4 = 922337203685477507L; // 천문학적인 숫자 저장, 뒤에 L을 붙임
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("-----------------------------------");
		
		// 실수형
		float  var1 = 0.123456789f;		// 소수점 7자리까지 표기됨, 뒤에 f를 붙여서 float형이라고 표시해줌
		double var2 = 0.123456789012345679; // 소수점 16자리까지 표기됨
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("-----------------------------------");
		
		// 논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("-----------------------------------");
		
		// 문자형
		char c1 = 'A';
		char c2 = '가';
//		char c3 = '가자'; // 문자 1개만 저장하기때문에 단어는 안됨

		System.out.println("c1 : "+ c1);
		System.out.println("c2 : "+ c2);
		System.out.println("-----------------------------------");
		
		// 문자열
		String str1 = "A";
		String str2 = "가";
		String str3 = "가자";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("-----------------------------------");
	}
}
