package sub4;

import java.util.Arrays;
import java.util.List;

/*
 * 날짜 : 2023.07.04
 * 내용 : Java 필터 스트림 실습
 */

public class FilterStreamTest {
	public static void main(String[] args) {
		// Arrays.asList : Array 생성하면서 데이터 넣어서 바로 초기화
		List<Integer> numbers 
			= Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		// 중복 제거
		// stream의 distinct를 통해서 중복 제거후,
		// forEach로 출력하는거임
		numbers.stream().distinct().forEach(
				num -> System.out.print(num + ", "));

		System.out.println("============================");
		
		//5 이상 데이터 필터링
		System.err.println("5이상 데이터 찾기");
		numbers.stream()
			.filter(num -> num >= 5).forEach(
				num -> System.out.print(num + ", "));
		
		System.out.println("============================");
		
		// 중복 제거, 짝수 데이터 출력
		System.err.println("중복 제거, 짝수 데이터 출력");
		numbers.stream().distinct()
			.filter(num -> num % 2 == 0)
			.forEach(num -> System.out.print(num + ","));
		
	} // main end
}
