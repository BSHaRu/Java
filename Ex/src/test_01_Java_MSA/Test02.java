package test_01_Java_MSA;

/*
 *   ☆☆☆★☆☆☆
 *   ☆☆★★★☆☆
 *   ☆★★★★★☆
 *   ★★★★★★★
 *   별 찍기
 */

public class Test02 {

	public static void main(String[] args) {
		
		int n = 4;
				
		for(int i = 0; i<n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
			}
			
			for(int k = 0; k < i*2+1; k++) {
				System.out.print("★");
			}
			
			for(int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
			}
			
			System.out.println();
			
		} // for end
	} // main end
}
