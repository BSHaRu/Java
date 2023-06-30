package test4;

import java.util.Scanner;

/*
 * 날짜 : 2023.06.30
 * 내용 : 예외처리 연습문제
 */

class NotFoundException extends Exception{
	public NotFoundException(){
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}

public class Test02_ExceptionEx {

	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 8, 10};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			// 자체적으로 throws로 던져버리니깐 catch로 잡을수가 없음
			// -> NotFound 클래스를 만들어서 거기다 던져놓고
			// NotFound시 catch에서 잡아내는거임 
			searchArray(find, arr);
			System.out.println("해당하는 숫자 찾음!!");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 정상 종료..");
	} // main end
	 
	private static void searchArray(int find, int[] arr) 
									throws NotFoundException {
		for(int i : arr) {
			if(i == find) {
				return;
			}
		} // for end
		throw new NotFoundException();
	}
}
