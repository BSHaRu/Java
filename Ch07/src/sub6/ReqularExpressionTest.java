package sub6;

import java.util.regex.Pattern;

/*
 * 날짜 : 2023.06.28
 * 내용 : java 정규식 실습
 */

public class ReqularExpressionTest {

	public static void main(String[] args) {

		// 정규식 표현식
		// a로 시작하는 알파벳 0개 이상 => * : 0개 이상 
		String strPatt = "a[a-z]*";
		
		boolean r1 = Pattern.matches(strPatt, "apple");
		boolean r2 = Pattern.matches(strPatt, "banana");
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		// 정규표현식 패턴
		String[] patters = {
			"[0-9]+",	// + : 숫자 1개 이상
			"1[0-9]*",	// 1로 시작하는 숫자 0개 이상 
			"^[0-9]",	// 숫자로 시작하는 문자 => ^[] : []로 시작해란 의미
			"[^0-9]",	// 숫자가 아닌 문자 => [^] : not을 의미
			".",		// . : 문자 1개
			"[a-z]?",	// 영어 소문자 1개
			"[a-z]*",	// 영어 소문자 0개 이상
			"[a-z]+",	// 영어 소문자 1개 이상
			"[A-Z]*",	// 영어 대문자 0개 이상
			"[가-힣]+",	// 한글 1자 이상
			"^[0-9a-z]*",// 숫자+영어 조합 0개 이상
			"^[0-9가-힣]*",// 숫자+한글 조합 0개 이상
			"^[A-z][a-z]*",// 영어 대문자로 시작하는 문자 0개 이상
			"\\s",		// 공백
			"\\S",		// 공백이 아닌 문자
			"\\d",		// 숫자
			"\\w",		// 숫자나 문자
			"\\W",		// 특수문자
		};
		
		String[] words = {
			"apple", "123한글", "123456", "011", "hello",
			"홍길동", "1", "Banana", "APPLE", "#"
		};
		
		for(String word : words) {
			System.out.print(word + " 문자와 일치하는 패턴 : ");
			
			for(String patt : patters) {
				boolean result = Pattern.matches(patt, word);
				if(result) {
					System.out.print(patt + ", ");
				} // if end
			} // patt for end
			System.out.println();
		} // word end
		System.out.println("------------------------------");
		
	} // main end

}
