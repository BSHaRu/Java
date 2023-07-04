package sub5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sub3.Person;

/*
 * 날짜 : 2023.07.04
 * 내용 : Java Map Stream 실습
 * 
 * Map Stream
 * 	- 스트림 요소(컬렉션에서 들어오는 요소)를 다른 요소로 변환 시키는 스트림
 * 	- map(), flatMap() 등
 */

public class MapStreamTest {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 24));
		people.add(new Person("장보고", 25));
		people.add(new Person("강감찬", 26));
		people.add(new Person("이순신", 27));
		
		// map
		people.stream()
			.map(person -> person.getName())
			.forEach(name -> System.out.print(name + ", "));
		System.out.println();
		
		System.out.println("====================================");
		
		List<String> list 
			= Arrays.asList("1,2,3", "4,5,6", "7,8,9");
		// 숫자 아니고, 문자열임
		System.out.println(list);
		System.out.println("list 길이 : " +list.size());
		
		// flatMap
		// split으로 짜르면 '문자열배열' 형식으로 되기 때문에
		// -> Array stream안에 넣어주는거임
		// => num이라고 해서 int 타입이 아니고 String임
		list.stream()
			.flatMap(str -> Arrays.stream(str.split(",")))
			.forEach(num -> System.out.print(num + ", "));
		
		/*.flatMap(str -> Arrays.stream(str.split(",")))
			=> stream<String> a(String str) {
			     return Arrays.stream(str.split(","));
				}
			faltMap(a); */
		
		System.out.println();
		System.out.println("====================================");
		
		
		// flatMapToInt
		int result = list.stream()
						// str의 size가 3이니깐 3번 들어가기때문에
						// nums[0]이 3개가 출력이 되는거다.
						.flatMapToInt(str -> {
							String[] strArr = str.split(",");
							int[] nums = new int[strArr.length];
							
							for(int i=0; i<strArr.length; i++) {
								nums[i] = Integer.parseInt(strArr[i]);
							}
							System.out.println("nums[0] : " + nums[0]);
							return Arrays.stream(nums);
						}).sum();
		System.out.println("result : " + result);
	}

}
