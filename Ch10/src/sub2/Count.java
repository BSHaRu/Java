package sub2;

public class Count {
	private int num;

	public int getNum() {
		return num;
	}

	// 동기화 블럭 : thread간의 경합을 막고 동기 방식으로 실행
	public synchronized void setNum() {
		/*
		 * 그냥 실행 시키면 thread 1,2,3에서
		 * 무작위로 들어와서 값의 오류가 생길 수 있다.
		 * -> 이는 비동기라서 thread 1이 다끝나기 전에
		 * 2~3에서 침투해서 count가 달라지게 되는거임
		 * => 이런 경우 오차가 발생하면 안되기 때문에
		 * 동기화(synchronized)를 시켜줘야됨
		 */
		this.num++;
	}
}
