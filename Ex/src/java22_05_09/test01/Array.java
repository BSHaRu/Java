package java22_05_09.test01;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		Integer[] iArray = {10, 20, 30, 40, 50};
		
		Double[] dArray = {1.1, 1.2, 1.3, 1.4, 1.5};
		
		Character[] cArray = {'K', 'O', 'R', 'E', 'A'};
		
		printArray(iArray);
		printArray(dArray);
		printArray(cArray);
	}// main end

	private static <T> void printArray(T[] array) {
		/*
		for(T arr : array) {
			System.out.print(arr +" ");
		}
		System.out.println();
		*/
		System.out.println(Arrays.toString(array));
	}
	
}
