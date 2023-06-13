package sub3;
/*
 * 날짜 : 2023.06.13
 * 내용 : Java 연산자 실습
 * 
 * 연산자(Operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로 산술, 복합대입, 비교, 논리연산을 수행
 */
public class OperatorTest {

	public static void main(String[] args) {
		
		// 산술 연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2;
		int result5 = num4 % num3;
		int result6 = num4 % 5; // 5 / 4 라서 몫은 0, 나머지는 4가 나옴
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("result5 : " + result5);
		System.out.println("result6 : " + result6);
		System.out.println("---------------------------------");
		
		// 증강 연산자
		int num = 0; // 변수 선언과 동시에 초기화
		num++;
		++num;
		
		System.out.println("num : " + num);
		System.out.println("---------------------------------");

		num--;
		--num;
		
		System.out.println("num : " + num);
		System.out.println("---------------------------------");
		
		// 복합대입 연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1;
		n2 -= 2; // n2 = n2 - 2;
		n3 *= 3; // n3 = n3 * 3;
		n4 /= 4; // n4 = n4 / 4;
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		
		System.out.println("---------------------------------");
		
		// 비교 연산자
		int var1 = 1;
		int var2 = 2;
		
		boolean rs1 = var1 > var2;  // var1은 var2보다 크다.
		boolean rs2 = var1 < var2;	// var1은 var2보다 작다.
		boolean rs3 = var1 >= var2;	// var1은 var2보다 크거나 같다.
		boolean rs4 = var1 <= var2;	// var1은 var2보다 작거나 같다.
		boolean rs5 = var1 == var2;	// var1은 var2보다 서로 같다.
		boolean rs6 = var1 != var2;	// var1은 var2보다 서로 다르다.
		
		System.out.println("rs1 = " + rs1);
		System.out.println("rs2 = " + rs2);
		System.out.println("rs3 = " + rs3);
		System.out.println("rs4 = " + rs4);
		System.out.println("rs5 = " + rs5);
		System.out.println("rs6 = " + rs6);
		
		System.out.println("---------------------------------");
		
		// 논리 연산자
		
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = (var3 > 3) && (var4 > 3); // var3은 3보다 크고 그리고 var4는 3보다 작다.
		boolean res2 = (var3 > 2) && (var4 > 3); // var3은 2보다 크고 그리고 var4는 3보다 작다.
		boolean res3 = (var3 > 3) || (var4 > 3); // var3은 3보다 크거나 var4는 3보다 작다.
		boolean res4 = (var3 > 3) || (var4 > 5); // var3은 3보다 크거나 var4는 5보다 작다.
		boolean res5 = !(var3 > var4); 			 // var3은 var4보다 크지 않다.
		
		System.out.println("res1 : " + res1);	
		System.out.println("res2 : " + res2);	
		System.out.println("res3 : " + res3);	
		System.out.println("res4 : " + res4);	
		System.out.println("res5 : " + res5);	
		
		System.out.println("---------------------------------");
		
	}

}
