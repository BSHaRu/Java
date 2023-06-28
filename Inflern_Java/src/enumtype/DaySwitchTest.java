package enumtype;

public class DaySwitchTest {

	public static void main(String[] args) {
		Day day = Day.SUNDAY;
		
		switch(day){
//			이렇게 쓰는게 아니라 enum에 지정한 상수 그대로 쓰면됨
//			case day.SUNDAY:
			case SUNDAY:
				System.out.println("일요일");
				break;
			case MONDAY:
				System.out.println("월요일");
				break;
			case TUESDAY:
				System.out.println("화요일");
				break;
			default:
				System.out.println("그 외 몰?루");
		}
		
		
	}

}
