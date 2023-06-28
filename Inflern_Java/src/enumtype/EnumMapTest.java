package enumtype;

import java.util.EnumMap;

public class EnumMapTest {

	public static void main(String[] args) {
		//Map은 key, value를 가지니깐 제네릭 선언 해줘야됨
		// Day.class : Day타입으로 지정한 상수의 모든값
		EnumMap<Day, Object> emap = new EnumMap<>(Day.class);
		emap.put(Day.SUNDAY, "일요일이다~");
		emap.put(Day.MONDAY, "월요일 싫어~");
		emap.put(Day.FRIDAY, "아싸 금요일이다~!!~!");
		
		System.out.println(emap.get(Day.SUNDAY));
	}

}
