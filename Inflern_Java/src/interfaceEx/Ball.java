package interfaceEx;

// 불변 객체 : 값을 가지면 변하지 않는 객체(getter만 있고, setter는 없는거)
// -> 공이 숫자를 가지면 그 숫자가 고정되어야함 
// => 1번공은 1번유지를 해야지 갑자기 17번공으로 변하면 안됨
public class Ball {

	private int number;
	
	public Ball(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
}
