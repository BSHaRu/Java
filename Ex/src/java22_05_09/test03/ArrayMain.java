package java22_05_09.test03;

public class ArrayMain {

	public static void main(String[] args) {
		ArraysTest<String> array = new ArraysTest<>(3);
		System.out.println(array); // [null, null, null]
		
		array.add("홍길동");
		array.add("유관순");
		array.add("신사임당");
		array.add("홍길동");
		
		System.out.println(array.size()); // 4
		System.out.println(array); // [홍길동, 유관순, 신사임당, 홍길동]
		
		array.remove("홍길동");
		System.out.println(array.size()); // 3
		System.out.println(array);// [유관순, 신사임당, 홍길동]
		
		array.remove("홍길동");
		System.out.println(array.size()); // 2
		System.out.println(array); //[유관순, 신사임당]
		
	}

}
