package sub5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 날짜 : 2023.06.27
 * 내용 : Java Date 클래스 실습
 * 
 */

public class DataTest {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println("d1 : " + d1);
		
		SimpleDateFormat sdf 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(d1);
		System.out.println("result : " + result);
		
		System.out.println("--------------------------");
		
		// Calendar는 싱글톤 객체기 때문에 new 생성자가 안됨
//		Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		// Calendar의 month는 1월이 0임
		// -> 그래서 항상 +1 을 해줘야 우리가 아는 달이 되는거임
		int month = cal.get(Calendar.MONTH) + 1; 
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d.%d.%d %d:%d:%d \n", 
				year, month, date, hour, min, sec);
		
		
	}
}
