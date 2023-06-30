package java22_05_06;

/*
 * String class의 method와
 * Integer class를 활용하여
 * 다음과 같이 출력해라
 * 
 * System.out.println(scores); // 100,11,35,41
 * System.out.println("총점 : " + total + "점"); // 총점 : 187점
 * System.out.printf("평균 : %.1f점" ,avg); // 평균 46.0점
 */

public class Test05 {
	public static void main(String[] args) {
		
		String scores = "100,11,35,41";
		
		int total = 0;
		double avg = 0.0;
		
		// 코드 작성
		String[] str = scores.split(",");
		
		for(int i=0; i<str.length; i++) {
			total += Integer.parseInt(str[i]);
			avg = (double)(total / str.length);
		}
		
		
		// 출력값
		System.out.println(scores); // 100,11,35,41
		System.out.println("총점 : " + total + "점"); // 총점 : 187점
		System.out.printf("평균 : %.1f점" ,avg); // 평균 46.0점
		
	}
	
}
