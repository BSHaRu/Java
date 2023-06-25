package interfaceEx;
/*
 * 1. 1~45까지 써있는 공을 로또 기계에 넣음
 * 2. 로또 기계에 있는 공을 섞음
 * 3. 섞인 볼 중 6개를 꺼냄
 */
public interface LottoMachine {

	// 인터페이스 필드값은 모두 상수이기 때문에 static final이 붙는다
	// -> 그렇기 때문에 static final이 생략 가능하다.
	public static final int MAX_BALL_COUNT = 45;
	int RETURN_BALL_COUNT = 6;	
	
	// 인터페이스는 모두 추상메서드기 때문에 abstract 생략 가능
	// 45개 볼을 가짐
	public abstract void setBall(Ball[] balls);
	
	// 볼을 섞음
	public void shuffle();
	
	// 6개 볼을 반환
	public Ball[] getBalls();
	
}
