package java22_05_09.test03;

import java.util.Arrays;

public class ArraysTest<E> {

	private int capacity; // 저장공간
	private E[] array;
	private int length;
	
	public ArraysTest() {};
	
	public ArraysTest(int capacity) {
		this.capacity = capacity;
	}
	
	// E타입의 값을 받아 빈 공간에 값을 추가
	// 공간이 없으면 공간 늘리고, 값은 마지막 공간에 추가
	public void add(String string) {
		
	}
	
	// E 타입 값을 받고 0번째 index부터 검색해서
	// 가장 처음에 만나는 index값을 제거하고 배열크기 줄임(-1)
	public void remove(String string) {
		
	}

	// 실제 배열에 들어간 값의 개수를 정수로 반환
	public int size() {
		return length;
	}
	
	// Arrays 클래스를 이용하여 문자열 반환
	public String toString() {
		return "["+Arrays.toString(array)+"]"; 
				
	}

	
		
	
}
