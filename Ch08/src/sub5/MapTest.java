package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜 : 2023.06.28
 * 내용 : Java Map 실습
 * 
 * 맵(Map)
 * 	- Key, Value 값으로 이루어진 자료구조
 * 	- Map을 구현한 HashMap.
 */

public class MapTest {

	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<>();
		
		// 데이터 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map); 
		
		System.out.println("map 크기 : " + map.size());
		
		// 데이터 출력
		System.out.println("Map A의 값 : " +  map.get('A'));
		System.out.println("Map B의 값 : " +  map.get('B'));
		System.out.println("Map C의 값 : " +  map.get('C'));
		
		System.out.println("--------------------------------");
		
		// map 반복문
		for(Character c : map.keySet()) {
			System.out.println(c + " - " + map.get(c));
		}
		
		System.out.println("--------------------------------");
		
		// List - Map 응용
		List<Map<Integer, Apple>> list = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 2000));
		m1.put(103, new Apple("일본", 1000));
		
		Map<Integer, Apple> m2 = new HashMap<>();
		
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 2000));
		m2.put(203, new Apple("호주", 1000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 2000));
		m3.put(303, new Apple("홍콩", 1000));
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		// list를 활용하여 해당 값을 꺼내라
		// 한국 사과
		Map<Integer, Apple> a1 = list.get(0);
		Apple ka = a1.get(101);
		ka.show();
		
		// list 없이 m1을 바로 참조해서 꺼낼 수도 있음
//		m1.get(101).show();
		
		// 호주 사과
		Map<Integer, Apple> a2 = list.get(1);
		Apple ap = a2.get(203);
		ap.show();
		
		// 태국 사과
		list.get(2).get(302).show();
		
		System.out.println("--------------------------------");
		
	} // main end
	
}
