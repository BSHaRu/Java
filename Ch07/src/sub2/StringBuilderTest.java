package sub2;

/*
 * 날짜 : 2023.06.27
 * 내용 : Java StringBuilder 클래스 실습
 * 
 * String Class
 * 	- String 문자열을 처리하는 클래스
 * 	- 문자열 비교는 equals
 * 	- 다양한 문자열 가공 메서드 제공
 *  - String 클래스는 불변 객체 특성을 가지고 있음
 *  	-> 성능 개선을 위해 StringBuilder 사용
 *  	=> 과거에는 메모리가 부족해서 썼지만, 지금은 잘 사용안함
 */

public class StringBuilderTest {

	public static void main(String[] args) {
		
		// String의 불변 객체를 보여줌
		String str = "Java";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));

		str += " Programming";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		System.out.println("str : " + str);
		
		System.out.println("-------------------------------------");
		
		// StringBuilder를 쓰면 하나의 메모리 공간에서 문자열이 추가됨
		// -> String이 가지고 있는 불변객체의 특성을 개선
		// 개인적으로 이게 필요한가..? 어짜피 gc가 다 해결 하잖아..?
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append(" Programming");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
	}

}
