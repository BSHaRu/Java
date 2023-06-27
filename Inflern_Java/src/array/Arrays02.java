package array;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		int[] array = {5,2,3,1,4};
		
		//
		Arrays.sort(array);
		for(int a = 0; a < array.length; a++) {
			System.out.print("array : " + array[a] +", ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		/* 1~100 중 1개를 생각하고 맞추는 게임
		 * -> 47을 생각함
		 * A : 50
		 * -> 그거보다 작아
		 * A : 30
		 * -> 그거보다 커
		 * ...
		 * 하면서 몇번째에 있는지 맞출 때 binarySearch를 씀
		 * -> 반드시 배열이 정렬되어야 사용 가능
		 * => 당연히 배열이기 때문에 index 번호로 찾음 
		 */
		int i = Arrays.binarySearch(array, 4);
		System.out.println(i);
	}
}
