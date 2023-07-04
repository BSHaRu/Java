package sub3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * 날짜 : 2023.07.04
 * 내용 : Java 컬렉션 스트림 실습
 * 
 * 스트림(Stream)
 * 	- 컬렉션 원소를 람다식으로 일괄처리(batch) 할 수 있는 API
 * 	- 내부적으로 병렬처리를 수행하여 대용량 데이터 처리에 더 나은 성능 제공 
 */

public class CollectionStreamTest {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		// 외부 반복자 이용한 출력
		// -> main Thread로 처리
		for(String name : names) {
			System.out.println("List names : " + name);
		}
		System.out.println();
		
		// 내부 반복자 이용한 출력
		// -> stream에서 보조 Thread로 처리
		// => 다량의 데이터일 경우 해당 방법이 성능적으로는 더 좋을 수 있음
		Stream<String> stream = names.stream();
		stream.forEach((name) -> {
			System.out.println("stream name : " + name);
		});
		
		System.out.println("=============================");
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 24));
		people.add(new Person("장보고", 25));
		people.add(new Person("강감찬", 26));
		people.add(new Person("이순신", 27));
		
		// 외부 반복자 이용한 출력
		for(Person person : people) {
			System.out.printf("이름 : %s, 나이 : %s \n"
					,person.getName(), person.getAge());
		}
		
		System.out.println("=============================");
		
		// 내부 반복자 이용한 출력
		Stream<Person> p = people.stream();
		p.forEach(person -> {
			System.out.printf("이름 : %s, 나이 : %s \n"
					,person.getName(), person.getAge());
		});
		
	} // main end
}
