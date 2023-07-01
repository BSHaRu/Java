package java22_05_09.test02;

/*
 Util.getValue() 메소드는 첫 번째 매개값으로 
 Pair 타입과 하위타입만 받고 두번째 매개값으로 key값을 받는다.
 return값은 key값이 일치 할 경우 Pair에 저장된 값을 리턴하고,
 일치하지 않으면 null을 반환하도록 getValue() 제네릭 메소드 작성
  
 OtherPair<String, Integer> otherPair = new OtherPair<>("고길동", 20);
 OtherPair는 Pair를 상속하지 않으므로 오류가 발생해야 한다.
 int otherAge = Util.getValue(otherPair, "홍길동");
 System.out.println(otherAge); 
 // 홍길동 : 35 
 // 고길동 : null 
*/
public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(pair.getKey() +" : "+age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("고길동", 20);
		Integer childAge = Util.getValue(childPair, "홍길동");
		System.out.println(childPair.getKey() +" : "+childAge);
		 
	}
}
