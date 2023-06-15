package sub1;

/*
 * 날짜 : 2023.06.14
 * 내용 : Java 배열 실습
 */

public class Array {

	public static void main(String[] args) {
		
		// 배열
		int[]    arr1 = {1, 2, 3, 4, 5};
		char[]   arr2 = {'A', 'B', 'C'};
		String[] arr3 = {"서울", "부산", "대구", "광주"};
		
		// 원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr3[3] : " + arr3[3]);
		System.out.println("---------------------");
		
		// 배열 길이
		System.out.println("arr1 길이 : " + arr1.length);
		System.out.println("arr2 길이 : " + arr2.length);
		System.out.println("arr3 길이 : " + arr3.length);

		System.out.println("---------------------");
		
		// 배열 반복문
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		// 위에는 올드한 배열 반복문이고 요즘 배열반복문은 이럼(향상된 for문)
		// arr2의 배열을 c변수에 담겠다.
		for(char c : arr2) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		for(String s : arr3) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("---------------------");
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};
		int total = 0;
		
		for(int sum : scores) {
			total += sum;
		}
		
		System.out.println("scores 합 : " + total);
		System.out.println("---------------------");
		
		// 2차원 배열 - 2중 for문을 써야됨
		int[][] arr2d = {
					{1,2,3,4}, 
					{5,6,7,8}, 
					{9,10,11,12} };
		
		for(int a=0; a<3; a++) {
			
			for(int b=0; b<4; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " 
								+ arr2d[a][b]);
			}
		}
		
		System.out.println("---------------------");
		
		// 3차원 배열
		int[][][] arr3d = {
					{	{1,2,3}, 
						{4,5,6}, 
						{7,8,9}	}, 
					
					{	{10,11,12}, 
						{13,14,15}, 
						{16,17,18} },
					
					{	{19,20,21}, 
						{22,23,24}, 
						{25,26,27} } };
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				for(int c=0; c<3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", 
							a,b,c, arr3d[a][b][c]);
				} // c for end
			} // b for end
		} // a for end
		
		
	} // main end

}
