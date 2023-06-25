package interfaceEx;

// 인터페이스를 구현하게 되면 
// 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야된다.
public class LottoMachineImpl implements LottoMachine{

	private Ball[] balls;
	
	@Override
	public void setBall(Ball[] balls) {
		this.balls = balls;
	}

	// Math.random() : 0.0 ~ 1.0
	@Override
	public void shuffle() {
		// 이 코드는 시행횟수가 높아야 잘 섞여서 1만번 잡은거임
		for(int i =0; i < 10000; i++) {
			// index에 넣는게 아니라서 +1 안해줘도됨
			int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
			int x2 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
			if(x1 != x2) {
				Ball temp = balls[x1];
				balls[x1] = balls[x2];
				balls[x2] = temp;
			} // if end
		} // for
	}

	@Override
	public Ball[] getBalls() {
		Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];
		for(int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++) {
			result[i] = balls[i];
		}
		return result;
	}

}
