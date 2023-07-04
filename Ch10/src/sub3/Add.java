package sub3;

public class Add {
	private int num;
	
	public int getNum() {
		return num;
	}

	// 지금 여기서는 동기화 안해줘도 됨(해줘도 상관은 없음)
	// -> at1과 at2가 둘다 새 인스턴스 Thread안에서 run이 실행됨
	// -> AddThread를 통해서 run이 실행되는데 
	// 각 각 다른 인스턴스에서 실행 되기때문에 동기화를 할 필요가 없음
	public synchronized void setNum(int num) {
		this.num += num;
	}
	
}
