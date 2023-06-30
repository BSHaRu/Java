package test4;

/*
 * 날짜 : 2023.06.30
 * 내용 : String, Wrapper 클래스 연습문제
 */


public class Test05_split_wrapper {

	public static void main(String[] args) {
		String strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");

//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
		int total = 0;
		
		for(int i=0; i<scores.length; i++) {
			// parseInt()의 리턴타입 : Int타입
			// -> 정수 값을 사용 할 때 주로 사용
			// valueOf() 의 리턴타입 : Wrpper형
			// -> 정수 값을 객체로 사용 할 때 사용
			total += Integer.valueOf(scores[i]);
//			System.out.println(total);
		}
		
		System.out.println("총점 : " + total);
	}
}
