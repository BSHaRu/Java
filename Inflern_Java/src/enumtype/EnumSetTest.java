package enumtype;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetTest {

	public static void main(String[] args) {
		//EnumSet.allOf(Day.class) 
		// ->Day가 가지고 있는 상수값들을 자동으로 EnumSet에 넣어줌 
		EnumSet<Day> eset = EnumSet.allOf(Day.class);
		
		Iterator<Day> dayIter = eset.iterator();
		while(dayIter.hasNext()) {
			Day day = dayIter.next();
			System.out.println("Today : " + day);
		}
		
		System.out.println("-------------------------------");
		
		// range(Day.MONDAY, Day.FRIDAY) : a~b까지 정한 상수값
		//-> Day에서 정한 상수값을 순서대로 범위를 지정하는거임
		EnumSet<Day> eset2 = EnumSet.range(Day.MONDAY, Day.FRIDAY);
		
		Iterator<Day> dayIter2 = eset2.iterator();
		while(dayIter2.hasNext()) {
			Day day = dayIter2.next();
			System.out.println(day);
		}
		
		
		
	}

}
