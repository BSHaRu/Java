package test4;

/*
 * 날짜 : 2023.06.30
 * 내용 : 문자열 처리 연습문제
 *  -> 결국 indexof 활용 문제네
 */

public class Test03_indexof {

	public static void main(String[] args) {
		String fileName = "자바 프로그래밍.pdf";
		
		// 파일명에도 .이 들어갈 수도 있기 때문에 뒤에서 찾는게 좋다.
		int idx = fileName.lastIndexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext	 = fileName.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
	}
}
