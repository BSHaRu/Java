package array;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		
		// 비교 할 때는 양수, 0, 음수 이거 3개를 신경써라
		// Arrays.compare(a, b) 
		// -> a > b = 1 / a < b = -1 / a = b = 0
		int compare1 = Arrays.compare(arr1, arr2);
		System.out.println(compare1);	// 0
		
		System.out.println("-----------------------");
		
		int[] arr3 = {2,2,3,4,5};
		int[] arr4 = {1,2,3,4,5};
		
		int compare2 = Arrays.compare(arr3, arr4);
		System.out.println(compare2);	// 1
		
		System.out.println("-----------------------");
		
		int[] arr5 = {1,2,3,4,5};
		int[] arr6 = {2,2,3,4,5};
		
		int compare3 = Arrays.compare(arr5, arr6);
		System.out.println(compare3); 	// -1
		
		System.out.println("-----------------------");
		
		int[] arr7 = {1,2,3,4,5};
		int[] arr8 = {1,2,3,4, 5};
		
		int compare4 = Arrays.compare(arr7, arr8);
		System.out.println(compare4);	// 0
		
	}

}
