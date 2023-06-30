package java22_05_06.extends01;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(pair.getKey() +" : "+age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("고길동", 20);
		Integer childAge = Util.getValue(childPair, "홍길동");
		System.out.println(childPair.getKey() +" : "+childAge);
		 
		/*
		OtherPair<String, Integer> otherPair = new OtherPair<>("홍길동", 20);
		//OtherPair는 Pair를 상속하지 않으므로 오류가 발생해야 한다.
		int otherAge = Util.getValue(otherPair, "홍길동");
		System.out.println(otherAge);
		*/
	}
}
