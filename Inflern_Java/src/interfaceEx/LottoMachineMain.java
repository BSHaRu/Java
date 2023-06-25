package interfaceEx;

public class LottoMachineMain {

	public static void main(String[] args) {
		
		// 변수 45개필요. -> ball인스턴스 45개 참조 할 수 있는 배열
		Ball balls[] = new Ball[LottoMachine.MAX_BALL_COUNT];
		for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
			balls[i] = new Ball(i + 1);
		}
		
		// LottoMachine 인스턴스 생성
		LottoMachine lottoMachine = new LottoMachineImpl();
		lottoMachine.setBall(balls);
		lottoMachine.shuffle();
		Ball[] result = lottoMachine.getBalls();
		
		for(int i =0; i < result.length; i++) {
			System.out.println(result[i].getNumber());
		}
		
	}

}
