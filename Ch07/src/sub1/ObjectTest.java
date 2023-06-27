package sub1;

/*
 * 날짜 : 2023.06.27
 * 내용 : Java Object Class 실습
 * 
 * Object 클래스
 * 	- 자바의 최상위 클래스로 모든 클래스는 Object를 상속 받고 있음
 * 	- 주요기능은 객체 비교를 위한 equals(), 객체 정보 조회를 위한 toString()제공
 * 
 */

public class ObjectTest {
	
	public static void main(String[] args) {
		
		// Object 타입으로 다형성 적용
		Apple apple1 = new Apple("한국", 3000);
		Object apple2 = new Apple("한국", 3000);
		
		// 객체 정보 조회
		System.out.println(apple1);
		System.out.println();
		apple2.toString();
		
		System.out.println("--------------------");
		
		// 객체 비교
		// == : 참조하고 있는 주소값이 같은지 여부
		if(apple1 == apple2) {
			System.out.println("apple1 == apple2");
		}else {
			System.out.println("apple1 != apple2");
		}
		
		System.out.println("--------------------");
		
		// equals : 참조하고 있는 값이 같은지 여부
		// -> 참조하는 곳이 달라서 동일한 값이라도 false가 나옴
		// => 재정의 해서 사용해야함
		if(apple1.equals(apple2)) {
			System.out.println("apple1 == apple2");
		}else {
			System.out.println("apple1 != apple2");
		}
		
	}
}
