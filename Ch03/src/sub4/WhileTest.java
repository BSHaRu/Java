package sub4;

/*
 * 날짜 : 2023.06.14
 * 내용 : Java 반복문 while문
 */

public class WhileTest {

	public static void main(String[] args) {
		
		// 1~10 sum
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		System.out.println("---------------------");
		
		// do ~ while : 먼저 실행하고 난 뒤 반복하기 
		int total = 0;
		int i = 1;
		
		do {
			if(i % 2 == 0) {
				total += i;
			} 
			i++;
		}while(i <= 10);
		
		System.out.println("1부터 10까지 짝수 합 : " + total);
		System.out.println("---------------------");
		
		// break : 가장 가까운 조건문 탈출
		int num = 1;
		
		while(true) {
			
			if(num % 5 == 0 && num % 7 == 0) break;
			
			num++;
		}
		
		System.out.println("5와 7의 최소 공배수 : " + num);
		System.out.println("---------------------");
		
		// continue : 조건문 처음으로 이동
		int tot = 0;
		int j = 0;
		
		while(j<=10) {
			
			j++;
			
			if(j % 2 == 1) continue;
			
			tot += j;
		}
		
		System.out.println("1~10까지 짝수 합 : " + tot);
	}

}
