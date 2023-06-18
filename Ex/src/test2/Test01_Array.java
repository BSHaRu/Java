package test2;

/*
 * 날짜 : 2023.06.15
 * 내용 : 자바 배열 문자 출력 연습문제 
 */

public class Test01_Array {

	public static void main(String[] args) {
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', 
					' ', 'Y', 'O', 'U'};
		int row, col;
		
		for(row = 1; row < 10; row++) {
			for(col = 0; col <= row; col++) {
				System.out.print(str[col]);
				
			} // col for end
			System.out.println();
		} // row for end
		
	} // main end

}
