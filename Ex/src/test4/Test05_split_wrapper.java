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
			//  Integer.parseInt(scores[i]); 쓰는게 더 명확
			// valueOf의 리턴타입 : Wrpper형
			total += Integer.valueOf(scores[i]);
//			System.out.println(total);
		}
		
		System.out.println("총점 : " + total);
	}
}
